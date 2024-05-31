package com.example.jpacompositekeydemo.services;

import com.example.jpacompositekeydemo.models.Person;
import com.example.jpacompositekeydemo.models.PersonKey;
import com.example.jpacompositekeydemo.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> get() {
        return personRepository.findAll();
    }

    @Override
    public Person get(String firstName, String lastName) {
        return personRepository.findById(new PersonKey(firstName, lastName))
                .orElseThrow(() -> new RuntimeException("Could not find the person"));
    }

    @Override
    public Person create(Person person) {
        return personRepository.saveAndFlush(person);
    }
}
