package com.example.demo.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getmessage(){
        return "To-do Application !";
    }
}
