package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	
		JdbcTemplate jdbcTemplate;

	public int insert(Employee employee) {
		
		String query ="insert into employee(id, name, city)values(?,?,?)";
		int result = jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getCity());
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
