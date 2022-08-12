package com.toph.studentxml;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> phones;
    private Address address;

    public Student(int id, String name, List<Phone> phones, Address address) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nId: " + id +
                "\nPhones: " + phones.toString() +
                "\nAddress: " + address.toString();
    }
}
