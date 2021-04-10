package com.example.demo1.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "Human")
public class Human {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
}
