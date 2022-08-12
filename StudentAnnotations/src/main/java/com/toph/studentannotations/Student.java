package com.toph.studentannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

    @Value("${student.id}")
    private int id;
    @Value("${student.name}")
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    @Override
    public String toString() {
        return "Name: " + name +
                "\nId: " + id +
                "\nPhones: " + ph.toString() +
                "\nAddress: " + add.toString();
    }
}
