package com.achintha.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)  //only store fields that ara not null
public class Person {

    @Id
    private String Id;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String> hobbies;
    private List<Address> addresses;
    
}
