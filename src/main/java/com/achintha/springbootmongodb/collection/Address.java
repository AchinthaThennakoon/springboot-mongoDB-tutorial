package com.achintha.springbootmongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private int no;
    private String street;
    private String city;
}
