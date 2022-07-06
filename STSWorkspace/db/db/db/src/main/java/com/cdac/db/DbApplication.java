package com.cdac.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.DAOBean;
import study.beans.DAOBeanUsingJdbcTemplete;
public class DbApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		context.scan("study.beans");
		
		
		DAOBean bean = context.getBean(DAOBean.class);
		//bean.insert(500, "charger", 850);
		bean.getProduct().stream().forEach((p)->{System.out.println(p);});
		
		//DAOBeanUsingJdbcTemplete bean2 = context.getBean(DAOBeanUsingJdbcTemplete.class);
		//bean2.insert(34, "jdbcTemplete", 150);
		//bean2.getProducts().stream().forEach((p)->{System.out.println(p);});
	}
}
