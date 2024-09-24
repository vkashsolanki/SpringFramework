package com.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entity.Student;

public class StudentDaoIpml implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public List<Student> getAllStudent() {
		
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperIpml());	
		return students;
	}
		
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
}
