package com.springaopdemo1.springaopdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Springaopdemo1Application {

	public static void main(String[] args) {

		SpringApplication.run(Springaopdemo1Application.class, args);
	}

}
