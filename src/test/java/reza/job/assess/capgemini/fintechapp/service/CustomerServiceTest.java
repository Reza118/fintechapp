package reza.job.assess.capgemini.fintechapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reza.job.assess.capgemini.fintechapp.exception.OpenAccountFailedException;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.repository.NewAccountRequestRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

public class CustomerServiceTest {

    @Mock
    NewAccountRequestRepository newAccountRequestRepository;

    @InjectMocks
    NewAccountRequestService newAccountRequestService;

    @BeforeEach
    public void SetUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void openInitAccount() throws Exception{

        NewAccountRequest acc = new NewAccountRequest("0123456789", "0");
        given(newAccountRequestRepository.save(new NewAccountRequest(Mockito.anyString(), Mockito.anyString()))).willReturn(acc);

        NewAccountRequest newAccountRequest = newAccountRequestService.createInitialAccount("0123456789", "0");
        assertNotNull(newAccountRequest);
        assertEquals("0123456789", newAccountRequest.getCustomerID());
        assertEquals("0", newAccountRequest.getInitialCredit());
    }

    @Test
    public void openInitAccountFailed(){

        given(newAccountRequestRepository.save(new NewAccountRequest(Mockito.anyString(), Mockito.anyString()))).willThrow(OpenAccountFailedException.class);

        assertThrows(OpenAccountFailedException.class, ()-> newAccountRequestService.createInitialAccount("0123456789", "0"));
    }
}
