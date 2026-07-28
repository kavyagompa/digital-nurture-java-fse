package com.cognizant.countryrest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.countryrest.model.Country;
import com.cognizant.countryrest.service.CountryService;


@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;


    @RequestMapping("/country")
    public Country getCountryIndia() {


        System.out.println("Start getCountryIndia method");


        Country country = countryService.getCountryIndia();


        System.out.println("End getCountryIndia method");


        return country;

    }

}