package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
//@Entity
public class Person {
    @Value("Vasya")
    private String name;
    @Value("43")
    private int age;
    @Value("Goose")
    private String gender;
    @Value("#{address}")
    private Address address;

    private String login = "QWERTY";
    private String password = "1234568";
}
