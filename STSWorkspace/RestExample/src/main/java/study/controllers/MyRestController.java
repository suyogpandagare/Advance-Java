package study.controllers;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/primary")

public class MyRestController {

	@GetMapping("/hello")
	public String f1()
	{
		return "hello from rest controller";
	}
	
	@GetMapping("/helloRE")
	public ResponseEntity<Integer> f10()
	{
		ResponseEntity<Integer> re = ResponseEntity.status(210).body(100);
		
		return re;
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
	
	@PutMapping("/square")
	public int f5(@RequestParam int num)
	{
		return num*num;
	}
	
	@PostMapping("sum/{n1}/{n2}/{n3}")
	public int f6(@PathVariable ("n1") int x,@PathVariable ("n2") int y,@PathVariable ("n3") int z)
	{
		return x+y+z;
	}
	
	@GetMapping("/welcome")
	public String f7(@RequestBody User u)
	{
		return "welcome "+ u.getUname()+" from "+u.getCity();
	}
	
	@GetMapping("/getuser")
	public User f8()
	{
		User u = new User();
		u.setUname("doremon");
		u.setCity("hampshire");
		return u;
	}
	
	@GetMapping("/getusers")
	public ArrayList<User> f9()
	{
		ArrayList<User> al = new ArrayList<User>();
		User u1 = new User();
		u1.setUname("doremon");
		u1.setCity("hampshire");
		
		User u2 = new User();
		u2.setUname("nobita");
		u2.setCity("kathora");
		
		al.add(u1);
		al.add(u2);
		
		
		return al;
	}
	
	
	
	
	
}
