package com.achintha.springbootmongodb.service;

import com.achintha.springbootmongodb.collection.Person;

import java.util.List;

public interface PersonService {

    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void deleteUser(String id);

    List<Person> getPersonByAge(Integer minAge, Integer maxAge);
}
