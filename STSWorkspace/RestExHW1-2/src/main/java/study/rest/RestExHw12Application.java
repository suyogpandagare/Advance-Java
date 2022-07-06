package study.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"study.controller","com.cdac.db"})
public class RestExHw12Application {

	public static void main(String[] args) {
		SpringApplication.run(RestExHw12Application.class, args);
	
	
	}

}
