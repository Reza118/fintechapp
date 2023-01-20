package reza.job.assess.capgemini.fintechapp.dto;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class CustAccDTO  {

    private String customerID;
    private String customerFirstName;
    private String customerLastName;
    private String customerAccount;
    private String balance;


    public CustAccDTO() {
    }

    public CustAccDTO(String customerID, String customerFirstName, String customerLastName, String customerAccount, String balance) {
        this.customerID = customerID;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAccount = customerAccount;
        this.balance = balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustAccDTO [customerID=" + customerID + ", customerFirstName=" + customerFirstName + ", customerLastName=" + customerFirstName + ", customerAccount="
                + customerAccount + "]";
    }

}
