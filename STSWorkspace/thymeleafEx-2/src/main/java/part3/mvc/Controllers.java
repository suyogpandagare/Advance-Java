package part3.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	public Controllers()
	{
		System.out.println("Controller called");
	}
	
	@GetMapping("/inputitem")
	public String input()
	{
		
		return "input.html";
	}
	
	@PostMapping("/save")
	public ModelAndView storeItem(HttpServletRequest request,ModelAndView mv,@RequestParam String item)
	{
		ArrayList<String> al = null;
		HttpSession session = request.getSession();
		if(session.getAttribute("al")==null)
		{
			al = new ArrayList<String>();
			al.add(item);
			session.setAttribute("item", al);
		}
		else
		{
			al = (ArrayList<String>)session.getAttribute("item");
			
			al.add(item);
			session.setAttribute("item", al);
		}
		
		
		mv.addObject("item", al);
		
		mv.setViewName("showitems.html");
		
		return mv;
	}
}
