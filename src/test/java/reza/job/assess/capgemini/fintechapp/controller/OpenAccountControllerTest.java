package reza.job.assess.capgemini.fintechapp.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import reza.job.assess.capgemini.fintechapp.enums.EndPointsEnum;

//Using JUnit 5
@ExtendWith(SpringExtension.class)
//Use following annotation to avoid the entire Spring context to be loaded for the test!
//The class "OpenAccountController" is written here and then is created in proper path!
@WebMvcTest(controllers = OpenAccountController.class )
public class OpenAccountControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void openAccountTest() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get(EndPointsEnum.OpenAccount_EndPoint.toString() + "/0123456789/0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
