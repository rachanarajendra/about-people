package com.example.people.api.human;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/humans")
public class HumanController {
    private String DEMO_PERSON = "John Smith";

    HumanController(){
    }


    @GetMapping("/readAll")
    public String readAll(){
        return this.DEMO_PERSON;
    }
}
