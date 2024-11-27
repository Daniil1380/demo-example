package com.cdek.glonassintegration.demoexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private AppService appService;

    public TestController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return appService.sayHello();
    }

}
