package com.cdek.glonassintegration.demoexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${a.b.c}")
    private String a;

    @GetMapping(value = "/hello")
    public String hello() {
        return a;
    }

}
