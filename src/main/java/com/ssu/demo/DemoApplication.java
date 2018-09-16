package com.ssu.demo;

import com.ssu.demo.controller.PropertyInjectedController;
import com.ssu.demo.service.EnglishGreeter;
import com.ssu.demo.service.Greeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		PropertyInjectedController controller = (PropertyInjectedController) context.getBean("propertyInjectedController");

		controller.greet();
	}
}
