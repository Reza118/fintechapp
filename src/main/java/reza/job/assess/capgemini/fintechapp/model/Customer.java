package reza.job.assess.capgemini.fintechapp.model;

import javax.persistence.*;

@Entity
@Table(name="customer",
        indexes = {@Index(name = "uindx_CustomerID",  columnList="customer_ID", unique = true)})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "customer_ID")
    private String customer_ID;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    public Customer() {}

    public Customer(String customer_ID, String first_name, String last_name) {
        this.setCustomer_ID(customer_ID);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

}
