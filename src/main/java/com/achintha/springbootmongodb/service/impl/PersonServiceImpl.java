package com.achintha.springbootmongodb.service.impl;

import com.achintha.springbootmongodb.collection.Person;
import com.achintha.springbootmongodb.repository.PersonRepository;
import com.achintha.springbootmongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getId();
    }

}
