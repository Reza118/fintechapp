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
import reza.job.assess.capgemini.fintechapp.service.CustomerService;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    //@CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "https://63cd774dc2544253ff254d8a--glistening-biscotti-fb2639.netlify.app")
    @RequestMapping(EndPointsEnum.EndpointConstants.ep_userInfo +
                    "/{" + EndPointsEnum.EndpointConstants.pathvar_custID + "}")
    public ResponseEntity<Iterable<CustAccDTO>> CustomerData(@PathVariable String customerID) throws Exception{

        Iterable<CustAccDTO> custAccDTO = customerService.getCustomerInfo(customerID);
        //System.out.println("Here in Controller!\nCustomerID = " + customerID + "\nInitialCredit = " + initialCredit);
        return new ResponseEntity<Iterable<CustAccDTO>>(custAccDTO, HttpStatus.OK);
    }
}
