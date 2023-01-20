package reza.job.assess.capgemini.fintechapp.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import reza.job.assess.capgemini.fintechapp.enums.EndPointsEnum;
import reza.job.assess.capgemini.fintechapp.exception.OpenAccountFailedException;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.service.OpenNewAccountService;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

//Using JUnit 5
@ExtendWith(SpringExtension.class)
//Use following annotation to avoid the entire Spring context to be loaded for the test!
//The class "OpenAccountController" is written here and then is created in proper path!
@WebMvcTest(controllers = OpenAccountController.class, excludeAutoConfiguration = {SecurityAutoConfiguration.class})
public class OpenInitialCustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    OpenNewAccountService openNewAccountService;

    @Test
    public void openAccountTest() throws Exception{

        NewAccountRequest acc = new NewAccountRequest("0123456789", "0");
        given(openNewAccountService.createInitialAccount(Mockito.anyString(), Mockito.anyString())).willReturn(acc);

        mockMvc.perform(MockMvcRequestBuilders.get(EndPointsEnum.EndpointConstants.ep_openAccount + "/0123456789/0"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath(EndPointsEnum.EndpointConstants.pathvar_custID).value("0123456789"))
                .andExpect(jsonPath(EndPointsEnum.EndpointConstants.pathvar_initcredit).value("0"));
    }

    @Test
    public void openAccountFailedTest() throws Exception {

        given(openNewAccountService.createInitialAccount(Mockito.anyString(), Mockito.anyString())).willThrow(OpenAccountFailedException.class);

        mockMvc.perform(MockMvcRequestBuilders.get(EndPointsEnum.EndpointConstants.ep_openAccount + "/0123456789/0"))
                .andExpect(MockMvcResultMatchers.status().isInternalServerError());
    }
}
