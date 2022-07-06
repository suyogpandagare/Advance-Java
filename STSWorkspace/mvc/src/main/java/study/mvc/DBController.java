package study.mvc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;

@Controller
public class DBController implements ApplicationContextAware{

//	@Autowired
//	JdbcTemplate template;
	
	@GetMapping("/add")
	public String f1(@RequestParam int pid,@RequestParam String name,@RequestParam int cost)
	{
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.update("insert into product values(?,?,?)",pid,name,cost);
		
		return "hello";
	}
	
	@GetMapping("/input")
	public String Bday()
	{
		return "Bdayinput";
	}
	
	@Autowired
	JdbcTemplate template;
	@GetMapping("/save")
	public String save(@RequestParam String name,@RequestParam String surname,@RequestParam String dob)
	{
		template.update("insert into birthday_tracker values(dafault,?,?,?)",name,surname,dob);
		
		template.queryForObject("select id from birthday_tracker where name=? ", new Object[] {name},String.class);
		
		return "inserted";
	}

	ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		
	}
	
}
