package com.toph.studentannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${address.city}")
    private String city;
    @Value("${address.state}")
    private String state;
    @Value("${address.country}")
    private String country;
    @Value("${address.zipcode}")
    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
