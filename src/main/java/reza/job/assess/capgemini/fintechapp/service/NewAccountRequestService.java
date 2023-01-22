package reza.job.assess.capgemini.fintechapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.repository.NewAccountRequestRepository;

@Service
public class NewAccountRequestService {

    @Autowired
    NewAccountRequestRepository newAccountRequestRepository;

    public NewAccountRequest createInitialAccount(String customerID, String initialCredit) {

        NewAccountRequest newAccountRequest = newAccountRequestRepository.save(new NewAccountRequest(customerID, initialCredit));

        return newAccountRequest;
    }
}