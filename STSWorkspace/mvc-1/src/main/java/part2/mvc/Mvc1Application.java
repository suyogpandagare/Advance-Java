package part2.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ComponentScan({"study.iet.controller","cdac.test"})  //for components present in different packages
@ImportResource({"classpath:beans.xml","classpath:config.xml"})
public class Mvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvc1Application.class, args);
	}

}
