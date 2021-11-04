package com.test.fabrik.testFabrick.controller;

import com.test.fabrik.testFabrick.model.Account;
import com.test.fabrik.testFabrick.model.Bonifico;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerAccount {

@GetMapping("/bonifico")
    private Bonifico getBonifico(Model model){

    String uri = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/14537780/payments/money-transfers";
    RestTemplate restTemplate = new RestTemplate();
    Bonifico bonifico =  restTemplate.getForObject(uri, Bonifico.class);
    return bonifico;

    }



}
