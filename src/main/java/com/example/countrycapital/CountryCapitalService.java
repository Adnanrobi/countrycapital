package com.example.countrycapital;

import com.example.countrycapital.CountryCapital;
import com.example.countrycapital.CountryCapitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryCapitalService {

    @Autowired
    private CountryCapitalRepository repository;

    public CountryCapital saveCountryCapital(CountryCapital countryCapital) {
        return repository.save(countryCapital);
    }

    public CountryCapital getCapitalByCountry(String country) {
        return repository.findByCountry(country);
    }
}
