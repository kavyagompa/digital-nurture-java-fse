package com.cognizant.countryrest.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.countryrest.model.Country;


@Service
public class CountryService {


    public Country getCountryIndia() {


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");


        Country country =
                context.getBean("country", Country.class);


        return country;

    }

}