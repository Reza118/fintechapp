package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.Utils.SortByAccountNo;
import reza.job.assess.capgemini.fintechapp.model.Accounts;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.model.Transactions;
import reza.job.assess.capgemini.fintechapp.repository.AccountRepository;
import reza.job.assess.capgemini.fintechapp.repository.NewAccountRequestRepository;
import reza.job.assess.capgemini.fintechapp.repository.TransactionsRepository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;


@Service
public class TxnAccountCompositeservice {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    TransactionsRepository transactionsRepository;

    @Autowired
    NewAccountRequestRepository newAccountRequestRepository;

    public Accounts CreateNewAccount(String customerID, String account, String balance) {

        Accounts accounts = accountRepository.save(new Accounts(customerID, account, balance));

        return accounts;
    }

    public Iterable<Accounts> FindAccountsByCustomerID(String cust_ID)
    {
        Iterable<Accounts> accounts = accountRepository.findByIterable(cust_ID);
        return accounts;
    }

    @Transactional
    public NewAccountRequest CreateNewAccount_SaveTransaction(String customer_ID, String initialCredit)
    {
        NewAccountRequest newAccountRequest = newAccountRequestRepository.save(new NewAccountRequest(customer_ID, initialCredit));

        List<Accounts> accs = (List<Accounts>) FindAccountsByCustomerID(customer_ID);
        Collections.sort(accs, new SortByAccountNo());

        String newAccountNumber = String.valueOf(Integer.valueOf(accs.get(accs.size()-1).getAccount()) + 1);
        CreateNewAccount(customer_ID, newAccountNumber, initialCredit);

        if(initialCredit != "0") {
            transactionsRepository.save(new Transactions(customer_ID, newAccountNumber,
                    Integer.valueOf(initialCredit) > 0 ? "+" : "-", initialCredit, LocalDateTime.now().toString(), initialCredit));
        }
        return newAccountRequest;
    }
}


