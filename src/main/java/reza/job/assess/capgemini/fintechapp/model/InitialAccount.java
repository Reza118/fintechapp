package reza.job.assess.capgemini.fintechapp.model;

import javax.persistence.*;

@Entity
@Table(name="Accounts")
public class InitialAccount {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String customerID;

    @Column
    private String initialCredit;

    public InitialAccount() {}

    public InitialAccount(String customerID, String initCredit) {
        this.customerID = customerID;
        this.initialCredit = initCredit;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getInitialCredit() {
        return initialCredit;
    }
    public void setInitialCredit(String initialCredit) {
        this.initialCredit = initialCredit;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
