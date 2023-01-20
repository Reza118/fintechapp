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
import reza.job.assess.capgemini.fintechapp.service.OpenNewAccountService;

@CrossOrigin(origins = "http://192.168.112.1:3000")
@RestController
public class OpenAccountController {

    @Autowired
    OpenNewAccountService openNewAccountService;

    @CrossOrigin(origins = "http://192.168.112.1:3000")
    @RequestMapping(EndPointsEnum.EndpointConstants.ep_openAccount +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_custID + "}" +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_initcredit + "}")
    public ResponseEntity<NewAccountRequest> OpenAccount(@PathVariable String customerID,
                                                         @PathVariable String initialCredit) throws Exception{

        NewAccountRequest iniAcc = openNewAccountService.createInitialAccount(customerID, initialCredit);
        //System.out.println("Here in Controller!\nCustomerID = " + customerID + "\nInitialCredit = " + initialCredit);
        return new ResponseEntity<NewAccountRequest>(iniAcc, HttpStatus.OK);
    }
}
