package com.pe.testing.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@CrossOrigin(origins = "*")
public class ControllerTest {
    @GetMapping()
    public String test(){
        return "HelloWorld";
    }
}
