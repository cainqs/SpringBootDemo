package com.example.demo;

import com.example.demo.aspect.UserAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class DemoApplication {

	@Bean(name="userAspect")
	public UserAspect initUserAspect(){
		return new UserAspect();
	}
		
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}