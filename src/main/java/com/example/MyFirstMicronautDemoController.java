package com.example;

import io.micronaut.http.annotation.*;

@Controller("/myFirstMicronautDemo")
public class MyFirstMicronautDemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}