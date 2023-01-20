package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.model.Accounts;
import reza.job.assess.capgemini.fintechapp.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Accounts CreateAccount(String customerID, String account, String balance) {

        Accounts accounts = accountRepository.save(new Accounts(customerID, account, balance));

        return accounts;
    }
}


