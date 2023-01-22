package reza.job.assess.capgemini.fintechapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import reza.job.assess.capgemini.fintechapp.model.Transactions;

public interface TransactionsRepository extends CrudRepository<Transactions, String> {

    @Query("SELECT t from Transactions t where t.customer_ID = ?1 AND t.account = ?2")
    public Iterable<Transactions> findByTransactions(String customer_ID, String account);

    public Transactions save(Transactions transactions);
}
