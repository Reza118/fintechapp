package reza.job.assess.capgemini.fintechapp.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class InitialCustomerRepositoryTest {

    @Autowired
    private OpenNewAccountRepository openNewAccountRepository;

    @Test
    public void openinitialAccountTest(){

        NewAccountRequest newAccountRequest = openNewAccountRepository.save(new NewAccountRequest("0123456789", "0"));
        assertTrue(newAccountRequest != null);
    }
}
