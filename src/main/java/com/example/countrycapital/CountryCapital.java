package com.example.countrycapital;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CountryCapital {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String country;
    private String capital;

    // Constructors
    public CountryCapital() {}

    public CountryCapital(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
