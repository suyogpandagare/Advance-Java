package com.example.HW1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.ProductBean;

public class Hw1Application {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	ProductBean obj1 = context.getBean("msg1",ProductBean.class);
	obj1.setCost(399);
	ProductBean obj2 = context.getBean("msg1",ProductBean.class);
	obj2.setCost(499);
	ProductBean obj3 = context.getBean("msg1",ProductBean.class);
	obj3.setCost(599);
	System.out.println(obj1.getName()+" ,"+obj1.getCost()+" ,"+obj1.getDescription());
	System.out.println(obj2.getName()+" ,"+obj2.getCost()+" ,"+obj2.getDescription());
	System.out.println(obj3.getName()+" ,"+obj3.getCost()+" ,"+obj3.getDescription());
	
	
	
	
	}

}
