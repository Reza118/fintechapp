package reza.job.assess.capgemini.fintechapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reza.job.assess.capgemini.fintechapp.enums.EndPointsEnum;
import reza.job.assess.capgemini.fintechapp.model.NewAccountRequest;
import reza.job.assess.capgemini.fintechapp.service.NewAccountRequestService;
import reza.job.assess.capgemini.fintechapp.service.TxnAccountCompositeservice;

//@CrossOrigin(origins = "http://192.168.112.1:3000")
@CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
@RestController
public class NewAccountRequestController {

    @Autowired
    NewAccountRequestService newAccountRequestService;

    @Autowired
    TxnAccountCompositeservice txnAccountCompositeservice;

    //@CrossOrigin(origins = "http://192.168.112.1:3000")
    @CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
    @RequestMapping(EndPointsEnum.EndpointConstants.ep_openAccount +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_custID + "}" +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_initcredit + "}")
    public ResponseEntity<NewAccountRequest> NewAccountRequestHandler(@PathVariable String customerID,
                                                         @PathVariable String initialCredit) throws Exception{

        //NewAccountRequest iniAcc = newAccountRequestService.createInitialAccount(customerID, initialCredit);
        NewAccountRequest iniAcc = txnAccountCompositeservice.CreateNewAccount_SaveTransaction(customerID, initialCredit);
        //System.out.println("Here in Controller!\nCustomerID = " + customerID + "\nInitialCredit = " + initialCredit);
        return new ResponseEntity<NewAccountRequest>(iniAcc, HttpStatus.OK);
    }
}
