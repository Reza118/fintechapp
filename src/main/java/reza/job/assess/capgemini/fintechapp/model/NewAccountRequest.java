package reza.job.assess.capgemini.fintechapp.model;

import javax.persistence.*;

@Entity
//@Table(name="new_account_request",
//        indexes = {@Index(name = "uindx_CustomerID_InitCredit",  columnList="customer_ID, initial_credit", unique = true)})
@Table(name="new_account_request")
public class NewAccountRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "customer_ID")
    private String customer_ID;

    @Column(name = "initial_credit")
    private String initial_credit;

    public NewAccountRequest() {}

    public NewAccountRequest(String customer_ID, String initial_credit) {
        this.customer_ID = customer_ID;
        this.initial_credit = initial_credit;
    }

    public String getCustomerID() {
        return customer_ID;
    }
    public void setCustomerID(String customerID) {
        this.customer_ID = customerID;
    }
    public String getInitialCredit() {
        return initial_credit;
    }
    public void setInitialCredit(String initialCredit) {
        this.initial_credit = initialCredit;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
