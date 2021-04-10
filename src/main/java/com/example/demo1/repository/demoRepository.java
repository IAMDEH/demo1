package com.example.demo1.repository;

import com.example.demo1.model.Human;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface demoRepository extends MongoRepository<Human, String> {

    List<Human> findHumansByAge(Integer age);
}
