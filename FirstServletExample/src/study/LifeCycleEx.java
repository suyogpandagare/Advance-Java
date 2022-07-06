package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/Life",loadOnStartup=1)

public class LifeCycleEx extends HttpServlet {
       
   
    public LifeCycleEx() {
        
    	System.out.println("constructor of lifeCycleEx called");
    }

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method is called");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet of LifeCycleEx called");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method called in LifeCycle");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method called in LifeCycle ex");
	}
	
}
