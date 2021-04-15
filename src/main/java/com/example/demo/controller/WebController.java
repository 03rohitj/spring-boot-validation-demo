package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class WebController {

    @GetMapping("/")
    public String showForm(Person person){
        return "form";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Person person, BindingResult result){
        if(result.hasErrors())
            return "form";

        System.out.println("Person : "+person);
        return "success";
    }
}
