package com.ajay.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Myapp1Application {

	public static void main(String[] args) {


		ApplicationContext context =SpringApplication.run(Myapp1Application.class, args);
     Dev obj=context.getBean(Dev.class);
	 obj.build();

	}

}
