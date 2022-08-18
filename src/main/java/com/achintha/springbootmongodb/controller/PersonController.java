package com.achintha.springbootmongodb.controller;

import com.achintha.springbootmongodb.collection.Person;
import com.achintha.springbootmongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String savePerson(Person person){
        return personService.save(person);
    }
}
