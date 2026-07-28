package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;


@Service
public class CountryService {


    public Country getCountry(String code) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");


        List<Country> countries = new ArrayList<>();

        countries.add((Country) context.getBean("india"));
        countries.add((Country) context.getBean("usa"));
        countries.add((Country) context.getBean("germany"));
        countries.add((Country) context.getBean("japan"));


        for(Country country : countries) {

            if(country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}