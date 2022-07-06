package com.cdac.db;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
public class JavaConfig {
	
	@Bean
	public JdbcTemplate getTemplate()// Inbuilt class
	{
		JdbcTemplate obj = new JdbcTemplate();
		obj.setDataSource(getDs());// methods injected here
		return obj;
	}
	
	 @Bean
	public DataSource getDs()
	{
		DriverManagerDataSource obj = new DriverManagerDataSource();
		obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
		obj.setUrl("jdbc:mysql://localhost:3306/ietMarch2022");
		obj.setUsername("root");
		obj.setPassword("root");
		return obj;
	}
}
