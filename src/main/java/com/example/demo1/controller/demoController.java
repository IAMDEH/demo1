package com.example.demo1.controller;

import com.example.demo1.model.Human;
import com.example.demo1.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class demoController {
    @Autowired
    demoService demoService;

    @GetMapping("/")
    public String defaultEndpoint(){

        return demoService.defaultEndpoint();
    }

    @PostMapping("/addHuman")
    public Human addHuman(@RequestBody Human human){

        return demoService.addHuman(human);
    }

    @DeleteMapping("/deleteHuman")
    public void deleteHuman(@RequestParam(name = "id")String id){

        demoService.deleteHuman(id);
    }

    @GetMapping("/getAll")
    public List<Human> getAllHumans(){

        return  demoService.getAllHumans();
    }

    @GetMapping("/getHumansByAge")
    public List<Human> getHumansByAge(@RequestParam(name = "age")Integer age){

        return demoService.getHumansByAge(age);
    }


}
