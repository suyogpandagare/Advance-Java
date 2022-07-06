package study.jparest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import study.jparest.entity.User;
import study.jparest.repository.UserRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/jpaex2")
public class RestController {

	@Autowired
	UserRepository repo;
	
	@PostMapping("/signup")
	public String signup(@RequestBody User u)
	{
		User ur = new User(u.getUsername(), u.getPassword());
		repo.save(ur);
		
		return "User Added Successfully";
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User u)
	{
	     List<User> user = repo.findAll();
	     
	     
	     
	     for(int i=0;i<user.size();i++)
	     {
	    	 if(user.get(i).getUsername().equals(u.getUsername()) && user.get(i).getPassword().equals(u.getPassword()))
	    	 {
	    		 return new ResponseEntity<User>(HttpStatus.OK);
	    	 }
	     }
	     
	     return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/allUsers")
	public List<String> showAllUsers()
	{
		List<String> s = new ArrayList<String>(); 
		List<User> list = repo.findAll();
		for(int i=0;i<list.size();i++)
		{
			s.add(list.get(i).getUsername());
		}
		
		return s;
	}
	
	@PutMapping("/changepwd/{uname}/{oldpwd}/{newpwd}")
	public String changePassword(@PathVariable String uname,@PathVariable String oldpwd,@PathVariable String newpwd)
	{
		 List<User> user = repo.findAll();
		 for (int i = 0; i < user.size(); i++) {
			if(user.get(i).getPassword().equals(oldpwd)) {
				user.get(i).setPassword(newpwd);
				repo.saveAll(user);
				return "Password Updated Successfully";
			}
		}
		
		return "Wrong Password";
	}
	
	@DeleteMapping("/removeuser/{uname}/{pwdForadmin}")	
	public String deleteUser(@PathVariable String uname,@PathVariable String pwdForadmin)
	{
		List<User> user = repo.findAll();
		 for (int i = 0; i < user.size(); i++) {
			if(user.get(i).getPassword().equals(pwdForadmin)) {
				repo.delete(user.get(i));
				
				return "User Deleted Successfully";
			}
		}
		
		return "Wrong Password";
		
	}
	
}







