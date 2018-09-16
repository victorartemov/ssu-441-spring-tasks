package com.ssu.demo.controller;

import com.ssu.demo.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private Greeter greeter;

    public void greet(){
        System.out.println(greeter.greet());
    }
}
