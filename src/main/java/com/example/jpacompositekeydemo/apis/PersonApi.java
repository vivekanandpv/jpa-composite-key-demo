package com.example.jpacompositekeydemo.apis;

import com.example.jpacompositekeydemo.models.Person;
import com.example.jpacompositekeydemo.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/persons")
public class PersonApi {
    private final PersonService personService;

    public PersonApi(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> get() {
        return ResponseEntity.ok(personService.get());
    }

    @GetMapping("{firstName}/{lastName}")
    public ResponseEntity<Person> get(@PathVariable String firstName, @PathVariable String lastName) {
        return ResponseEntity.ok(personService.get(firstName, lastName));
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return ResponseEntity.ok(personService.create(person));
    }
}
