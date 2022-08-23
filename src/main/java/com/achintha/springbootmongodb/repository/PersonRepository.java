package com.achintha.springbootmongodb.repository;

import com.achintha.springbootmongodb.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
    //define the implementation
    List<Person> findByFirstNameStartsWith(String name);

    //List<Person> findByAgeBetween(Integer minAge,Integer maxAge);

    @Query(
            value = "{'age':{$gt:?0 ,$lt:?1}}",
            fields = "{addresses : 0}" // fields that need , 0=not need, 1=need
    )
    List<Person> findPersonByAge(Integer minAge,Integer maxAge);
}
