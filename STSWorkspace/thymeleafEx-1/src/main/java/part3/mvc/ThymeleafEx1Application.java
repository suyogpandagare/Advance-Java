package part3.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("study.controllers")
public class ThymeleafEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafEx1Application.class, args);
	}

}
