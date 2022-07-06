package study.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/another")
public class AnotherController {

	@GetMapping("/hello")
	public String f1()
	{
		return "hello from another rest controller";
	}
	
	@PostMapping("/postit")
	public String f2()
	{
		return "hii from post";
	}
	
	@PutMapping("/putit")
	public String f3()
	{
		return "hii from put";
	}
	
	@DeleteMapping("/deleteit")
	public String f4()
	{
		return "hii from delete";
	}
}
