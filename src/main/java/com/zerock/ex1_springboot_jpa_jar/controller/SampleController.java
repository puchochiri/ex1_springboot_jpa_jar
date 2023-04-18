package com.zerock.ex1_springboot_jpa_jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"Hellog", "World"};
    }



}
