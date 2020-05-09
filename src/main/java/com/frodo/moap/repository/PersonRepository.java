package com.frodo.moap.repository;

import com.frodo.moap.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Person savePerson(Person person) {

        return null;

    }
}
