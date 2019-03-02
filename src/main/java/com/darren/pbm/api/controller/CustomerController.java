package com.darren.pbm.api.controller;

import com.darren.pbm.api.dao.CustomerDetailsRepository;
import com.darren.pbm.api.model.CustomerDetails;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/customer")
public class CustomerController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    @GetMapping("/email/{email}")
    public List<CustomerDetails> findCustomerIdByEmailAddress(@PathVariable String email){
        List<CustomerDetails> customer_details = customerDetailsRepository.findAllByEmail(email);
        return customer_details;
    }

    @GetMapping("/customerNumber/{customerNumber}")
    public List<CustomerDetails>  findCustomerIdByCustomerNumber(@PathVariable String customerNumber){
        List<CustomerDetails>  customer_details = customerDetailsRepository.findAllByCustNo(customerNumber);
        return customer_details;
    }
}
