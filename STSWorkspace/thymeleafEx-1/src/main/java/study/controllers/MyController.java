package study.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/ex1")
	public String f1(Model model,@RequestParam String name)
	{
		if(name.equals("abc"))
		return "first.html";
		else
		{
			model.addAttribute("name",name);
			return "second.html";
	
		}
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
		 mv.setViewName("ex.html");
		 return mv;
	 }
	
	@GetMapping("/tryif")
	public String f3(Model m,@RequestParam int num)
	{
		m.addAttribute("num",num);
		return "ifex.html";
	}
	
	
	
	
	
	
	
	
	
}
