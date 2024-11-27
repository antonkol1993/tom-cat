package org.example.service;

import lombok.ToString;
import org.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
public class PersonService {

//    @Autowired
    private PersonRepository personRepository;

    @Autowired
    @Qualifier("jdbcUrl1")
    public String jdbcUrlfff;

    public void todo() {
        personRepository.deleteAll();
    }
}
