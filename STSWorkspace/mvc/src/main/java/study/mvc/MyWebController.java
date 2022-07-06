package study.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller   //this is read by the spring framework if present then makes controller
public class MyWebController {

	public MyWebController()
	{
		System.out.println("the controller is created");
	}
	
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)//jabbhi request hello hoga and method get hoga 
	public String f1()
	{
		System.out.println("mapping function f1 is called");
		return "hello";  //this string is collected by spring framework
	}
	 
	@GetMapping(value="/welcome")
	public String f2(@RequestParam("uname") String name)   //uname ke value name me dalo
	{
		System.out.println("server got "+name);
		return "hi";   //request forwoded to hi
	}
	
	@GetMapping(value="/input")    //get request ata hai to getmapping 
	public String f3()
	{
		return "input";
	}
	
	@PostMapping(value="/showTable")   //post request ata hai to postmapping
	public String f4(Model model ,@RequestParam int num) //input ka nam bhi num hai hence num me catch ke rahe
	{
		
		  ArrayList<String> al = TableGen.getTable(num); 
		  //this is model 
		  model.addAttribute("list",al);  //model ke object me sab store ho ke table pe jaiga
		 
		//this is view and controller handeling them both
		return "table";
	}
	
	@GetMapping(value="/showchars")
	 public ModelAndView f5(ModelAndView mv,@RequestParam String line)
	 {
		ArrayList<String> al = new ArrayList<String>();
		 for(int i=0;i<line.length();i++)
		 {
			 al.add(""+line.charAt(i));
		 }
		 
		 mv.addObject("list",al);    //attributeName and attribute value
		 mv.setViewName("table");
		 return mv;
	 }
	
	@GetMapping("/thex")
	public String thex(Model m,@RequestParam String uname,@RequestParam String pass)
	{
		User u = new User(uname,pass);
		m.addAttribute("user",u);
		return "test2.html";
	}
	
}
