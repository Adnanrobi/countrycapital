package com.example.countrycapital;

import com.example.countrycapital.CountryCapital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryCapitalRepository extends JpaRepository<CountryCapital, Long> {
    CountryCapital findByCountry(String country);
}
