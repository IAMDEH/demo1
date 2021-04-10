package com.example.demo1.service;

import com.example.demo1.model.Human;
import com.example.demo1.repository.demoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class demoService {

    @Autowired
    demoRepository demoRepository;

    public String defaultEndpoint() {

        return "Hello world";
    }

    public Human addHuman(Human human) {

        return demoRepository.insert(human);
    }

    public List<Human> getHumansByAge(Integer age) {

        return demoRepository.findHumansByAge(age);
    }

    public List<Human> getAllHumans() {

        return  demoRepository.findAll();
    }

    public void deleteHuman(String id) {

        demoRepository.deleteById(id);
    }
}
