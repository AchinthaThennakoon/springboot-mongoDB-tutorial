package com.achintha.springbootmongodb.controller;

import com.achintha.springbootmongodb.collection.Person;
import com.achintha.springbootmongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String savePerson(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getPersonStartsWith(@RequestParam("name") String name){
        return personService.getPersonStartWith(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        personService.deleteUser(id);
    }

    @GetMapping("/age")
    public List<Person> getPersonByAge(@RequestParam Integer minAge,
                                       @RequestParam Integer maxAge){
        return personService.getPersonByAge(minAge,maxAge);
    }

    //searching with pagination


}
