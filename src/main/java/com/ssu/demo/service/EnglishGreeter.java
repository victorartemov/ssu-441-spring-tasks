package com.ssu.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile("en")
public class EnglishGreeter implements Greeter {
    @Override
    public String greet() {
        return "Hello!";
    }
}
