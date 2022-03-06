package com.oslomet.spring2.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import com.oslomet.spring2.repository.Kunde;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Forskjell på GET og POST
//Den her er et eks, og dette kalles Server

@RestController
public class KundeController {
    @Autowired
    Kunde repository;

    @PostMapping("/kunde")
    public Kunde returKunde(Kunde innKunde) {
        return innKunde;
    }
}
