package reza.job.assess.capgemini.fintechapp.model;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "customer_ID")
    private String customer_ID;

    @Column(name = "account")
    private String account;

    @Column(name = "balance")
    private String balance;

    public Accounts() {}

    public Accounts(String customer_ID, String account, String balance) {

        this.setCustomer_ID(customer_ID);
        this.setAccount(account);
        this.setBalance(balance);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
