package spring_learn.service;

import org.springframework.stereotype.Service;

import spring_learn.model.Country;

@Service
public class CountryService {


    public Country getCountry(String code) {


        if(code.equalsIgnoreCase("in")) {

            return new Country("IN", "India");

        }

        if(code.equalsIgnoreCase("us")) {

            return new Country("US", "United States");

        }

        if(code.equalsIgnoreCase("uk")) {

            return new Country("UK", "United Kingdom");

        }


        return null;
    }
}