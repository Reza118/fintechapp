package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.dto.CustAccDTO;
import reza.job.assess.capgemini.fintechapp.model.Customer;
import reza.job.assess.capgemini.fintechapp.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> getCustomer(String customerID) {

        Iterable<Customer> customers = customerRepository.findByCustomer_ID(customerID);

        return customers;
    }

    public Iterable<CustAccDTO> getCustomerInfo(String customerID) {

        Iterable<CustAccDTO> customers = customerRepository.fetch(customerID);

        return customers;
    }
}
