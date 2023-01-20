package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.model.Accounts;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.repository.OpenNewAccountRepository;

@Service
public class OpenNewAccountService {

    @Autowired
    OpenNewAccountRepository openNewAccountRepository;

    public NewAccountRequest createInitialAccount(String customerID, String initialCredit) {

        NewAccountRequest newAccountRequest = openNewAccountRepository.save(new NewAccountRequest(customerID, initialCredit));

        return newAccountRequest;
    }
}