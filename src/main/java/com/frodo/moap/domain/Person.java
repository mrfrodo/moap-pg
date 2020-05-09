package com.frodo.moap.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Person {

    String firstName;
    String lastName;
    String address;
}
