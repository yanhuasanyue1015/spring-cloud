package com.example.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${userName}")
    private String userName;
    @GetMapping("/userName")
    public String getUserName(){
        return userName;
    }
}
