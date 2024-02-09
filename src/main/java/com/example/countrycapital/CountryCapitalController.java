package com.example.countrycapital;

import com.example.countrycapital.CountryCapital;
import com.example.countrycapital.CountryCapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/country")
public class CountryCapitalController {

    @Autowired
    private CountryCapitalService service;

    @PostMapping("/save")
    public ResponseEntity<CountryCapital> saveCountryCapital(@RequestBody CountryCapital countryCapital) {
        return ResponseEntity.ok(service.saveCountryCapital(countryCapital));
    }

    @GetMapping("/{countryName}")
    public ResponseEntity<?> getCapitalByCountry(@PathVariable String countryName) {
        CountryCapital countryCapital = service.getCapitalByCountry(countryName);
        if (countryCapital != null) {
            // Return a response with only the capital information
            return ResponseEntity.ok(Map.of("capital", countryCapital.getCapital()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
