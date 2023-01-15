package reza.job.assess.capgemini.fintechapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reza.job.assess.capgemini.fintechapp.enums.EndPointsEnum;
import reza.job.assess.capgemini.fintechapp.model.InitialAccount;
import reza.job.assess.capgemini.fintechapp.service.AccountService;

@RestController
public class OpenAccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(EndPointsEnum.EndpointConstants.ep_openAccount +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_custID + "}" +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_initcredit + "}")
    public ResponseEntity<InitialAccount> OpenAccount(@PathVariable String customerID,
                                                      @PathVariable String initialCredit) throws Exception{

        InitialAccount acc = accountService.getAccount(customerID, initialCredit);
        //System.out.println("Here in Controller!\nCustomerID = " + customerID + "\nInitialCredit = " + initialCredit);
        return new ResponseEntity<InitialAccount>(acc, HttpStatus.OK);
    }
}
