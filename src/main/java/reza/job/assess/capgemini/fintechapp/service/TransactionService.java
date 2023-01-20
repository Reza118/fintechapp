package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.model.Customer;
import reza.job.assess.capgemini.fintechapp.model.Transactions;
import reza.job.assess.capgemini.fintechapp.repository.TransactionsRepository;

@Service
public class TransactionService {

    @Autowired
    TransactionsRepository transactionsRepository;

    public Iterable<Transactions> getTXNs(String customerID, String account) {

        Iterable<Transactions> txns = transactionsRepository.findByTransactions(customerID, account);

        return txns;
    }
}
