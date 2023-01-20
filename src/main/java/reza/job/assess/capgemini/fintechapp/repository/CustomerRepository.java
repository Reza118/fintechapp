package reza.job.assess.capgemini.fintechapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import reza.job.assess.capgemini.fintechapp.dto.CustAccDTO;
import reza.job.assess.capgemini.fintechapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Query("SELECT c from Customer c where c.customer_ID = ?1")
    public Iterable<Customer> findByCustomer_ID(String customer_ID);

    @Query(value = "SELECT new reza.job.assess.capgemini.fintechapp.dto.CustAccDTO(c.customer_ID, c.first_name, c.last_name, a.account, a.balance) " +
            "From Accounts a " +
            "INNER JOIN Customer c ON a.customer_ID = c.customer_ID " +
            "Where a.customer_ID = ?1")
    public Iterable<CustAccDTO> fetch(String customer_ID);
}
