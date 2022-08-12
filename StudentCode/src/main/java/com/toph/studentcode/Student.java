package com.toph.studentcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Student {

    @Value("${student.id}")
    private int id;
    @Value("${student.name}")
    private String name;
    @Autowired
    private List<Phone> phone;
    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Name: " + name +
                "\nId: " + id +
                "\nPhones: " + phone.toString() +
                "\nAddress: " + address.toString();
    }
}
