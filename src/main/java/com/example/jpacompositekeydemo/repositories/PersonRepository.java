package com.example.jpacompositekeydemo.repositories;

import com.example.jpacompositekeydemo.models.Person;
import com.example.jpacompositekeydemo.models.PersonKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonKey> {
}
