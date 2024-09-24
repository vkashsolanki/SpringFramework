package com.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.EmployeDao;
import com.dao.EmployeeDaoImple;

public class JdbcConfig {
	
	@Bean("driverManagerDataSource")
	public DriverManagerDataSource getDataSource()
	{
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");		
		return driverManagerDataSource; 
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
		
	}
	@Bean("employeeDaoImple")
	public EmployeDao getEmployeDao()
	{
		EmployeeDaoImple  employeeDaoImple = new EmployeeDaoImple();
		employeeDaoImple.setJdbcTemplate(getJdbcTemplate());
		
		
		return employeeDaoImple;
		
	}
	
	

	
	
}
