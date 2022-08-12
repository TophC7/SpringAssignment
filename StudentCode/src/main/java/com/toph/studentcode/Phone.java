package com.toph.studentcode;

import org.springframework.beans.factory.annotation.Value;

public class Phone {

//    @Value("${phone.mob1}")
    private String mob;

    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

}
