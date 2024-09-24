 package com.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.EmployeDao;
import com.dao.EmployeeDaoImple;

@Configuration
@ComponentScan(basePackages = "com.dao")
public class JdbcConfig {
	
	@Bean("driverManagerDataSource")
	public DriverManagerDataSource getDataSource()
	{
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jdbcwithannotation");
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
	

	
	
}
