package com.toph.studentcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("/application.properties")
public class SpringConfig {

    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public Phone phone(@Value("${phone.mob1}") String number) { return new Phone(number); }

    @Bean
    public Phone phoneTwo(@Value("${phone.mob2}") String number) { return new Phone(number); }

    @Bean
    @Autowired
    public List<Phone> listPhone(Phone phone, Phone phoneTwo){
        return Arrays.asList(phone, phoneTwo);
    }

    @Bean
    public Address address(){
        return new Address();
    }

}
