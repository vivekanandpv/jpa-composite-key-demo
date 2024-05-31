package com.example.jpacompositekeydemo.services;

import com.example.jpacompositekeydemo.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> get();
    Person get(String firstName, String lastName);
    Person create(Person person);
}
