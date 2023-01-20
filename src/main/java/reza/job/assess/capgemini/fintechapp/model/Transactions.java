package reza.job.assess.capgemini.fintechapp.model;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "customer_ID")
    private String customer_ID;

    @Column(name = "account")
    private String account;

    @Column(name = "txn")
    private String txn;

    @Column(name = "txn_amount")
    private String txn_amount;

    @Column(name = "date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private String date_time;

    @Column(name = "balance_after_txn")
    private String balance_after_txn;

    public Transactions() {}

    public Transactions(Long id, String customer_ID, String account, String txn, String txn_amount, String date_time, String balance_after_txn) {
        this.id = id;
        this.customer_ID = customer_ID;
        this.account = account;
        this.txn = txn;
        this.txn_amount = txn_amount;
        this.date_time = date_time;
        this.balance_after_txn = balance_after_txn;
    }

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public String getTxn_amount() {
        return txn_amount;
    }

    public void setTxn_amount(String txn_amount) {
        this.txn_amount = txn_amount;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getBalance_after_txn() {
        return balance_after_txn;
    }

    public void setBalance_after_txn(String balance_after_txn) {
        this.balance_after_txn = balance_after_txn;
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
}
