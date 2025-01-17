package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final List<Person> persons;

    public PersonService() {
        this.persons = List.of(new Person("John", "Doe"), new Person("Jane", "Doe"));
    }

    public List<Person> getPerson() {
        return persons;
    }



}
