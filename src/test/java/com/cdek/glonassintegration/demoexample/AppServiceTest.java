package com.cdek.glonassintegration.demoexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;


class AppServiceTest {

    private AppService appService = new AppService();

    @Test
    public void test() {
        assertEquals("Hello", appService.sayHello());
    }




}