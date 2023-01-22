package reza.job.assess.capgemini.fintechapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reza.job.assess.capgemini.fintechapp.dto.CustAccDTO;
import reza.job.assess.capgemini.fintechapp.enums.EndPointsEnum;
import reza.job.assess.capgemini.fintechapp.model.Transactions;
import reza.job.assess.capgemini.fintechapp.service.CustomerService;
import reza.job.assess.capgemini.fintechapp.service.TransactionService;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    //@CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
    @RequestMapping(EndPointsEnum.EndpointConstants.ep_txns +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_custID + "}" +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_account + "}")
    public ResponseEntity<Iterable<Transactions>> CustomerData(@PathVariable String customerID, @PathVariable String account) throws Exception{

        Iterable<Transactions> transactions = transactionService.getTXNs(customerID, account);
        System.out.println("Here in Txn Controller!\nCustomerID = " + customerID + "\nAccount = " + account);
        return new ResponseEntity<Iterable<Transactions>>(transactions, HttpStatus.OK);
    }
}
