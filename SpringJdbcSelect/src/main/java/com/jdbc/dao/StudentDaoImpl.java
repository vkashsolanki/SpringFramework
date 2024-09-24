package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

//	public int insert(Student student) {
//		
//		// Insert Query
//		String query = "insert into student(id, name,city) values(?,?,?)";
//		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
//		System.out.println();
//
//		return result;
//	}
//
//	public int change(Student student) {
//			// updating data
//		String query = "update student set name=? , city=? where id=?";
//		int result1 = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
//		return result1;
//
//	}
//		
//	public int delete(int id) {
//		// delete data
//		String query = "delete from student where id =?";
//		int result = this.jdbcTemplate.update(query, id);		
//		return result;
//	}
	
//	// single obejct selecting by class bana ke rowMapperimpl ka 
//	public Student getStudent(int id) {
//		String query = "select * from student where id=?";
//		RowMapper rowMapper = new RowMapperImpl();
//	    Student student = this.jdbcTemplate.queryForObject(query,rowMapper, id);
//		return student;
//	}
	
	
	// multiple obejct selecting by class bana ke rowMapperimpl ka 
	public List<Student> getAllStudent() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return students;
	}

	
	// single obejct selecting by class bana ke rowMapper ka anonymous bana ke yahi pass kerenge implementations 
//	public Student getStudent(int id) {
//		String query = "select * from student where id=?";
//	    Student student = this.jdbcTemplate.queryForObject(query,new RowMapper() {
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// row mapping 
//				 Student student = new Student();
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				return student;
//				
//			}}, id);
//		return student;
//		
//	}

	
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}





}
