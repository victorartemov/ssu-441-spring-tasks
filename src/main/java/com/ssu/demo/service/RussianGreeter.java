package com.ssu.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"ru","default"})
public class RussianGreeter implements Greeter {
    @Override
    public String greet() {
        return "Привет!";
    }
}
