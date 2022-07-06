package study.jparest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.ProductEntity;
import study.jparest.repository.Myrepository;

@RestController
@RequestMapping(path = "/jpaex")
public class MyRestController {

	@Autowired
	Myrepository repo;
	
	
	@PostMapping("/add/{id}/{name}/{cost}")
	public String insertProduct(@PathVariable int id,@PathVariable String name,@PathVariable int cost)
	{
		ProductEntity obj = new ProductEntity(id,name,cost);
		repo.save(obj);
		return "insert done";
	}
	
}
