package com.example.servicefeign.web;

import com.example.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name, HttpServletRequest request) {
        return hiService.hi(name);
    }
}
