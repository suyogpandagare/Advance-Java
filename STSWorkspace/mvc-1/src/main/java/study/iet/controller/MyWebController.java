package study.iet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyWebController {

	public MyWebController()
	{
		System.out.println("myweb controller  created");
	}
	
	@GetMapping("/test")
	public String m1()
	{
		return "test";
	}
	
	int count=0;
	
	@GetMapping("/counter")
	public ModelAndView m2(HttpServletRequest request,ModelAndView mv)
	{
		HttpSession session = request.getSession();
		int ucount=0;
		if(session.isNew())
		{
			ucount=1;
			session.setAttribute("ucount",ucount);
		}
		else
		{
			ucount=(Integer)session.getAttribute("ucount");
			ucount++;
			session.setAttribute("ucount", ucount);
		}
		mv.addObject("globalcount",++count);
		mv.setViewName("counter");
		return mv;
	}
}
