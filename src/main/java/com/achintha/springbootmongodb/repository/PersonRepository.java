package com.achintha.springbootmongodb.repository;

import com.achintha.springbootmongodb.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
    //define the implementation
    List<Person> findByFirstNameStartsWith(String name);

    List<Person> findByAgeBetween(Integer minAge,Integer maxAge);
}
