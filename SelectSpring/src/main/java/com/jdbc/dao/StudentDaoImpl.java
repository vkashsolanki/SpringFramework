package com.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	public List<Student> getAllStudent() {
		
		String query ="select * from student";
		List<Student> query2 = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return query2;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	


	
	
}
