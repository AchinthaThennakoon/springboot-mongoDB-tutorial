package com.achintha.springbootmongodb.service;

import com.achintha.springbootmongodb.collection.Person;

import java.util.List;

public interface PersonService {

    public String save(Person person);

    List<Person> getPersonStartWith(String name);
}
