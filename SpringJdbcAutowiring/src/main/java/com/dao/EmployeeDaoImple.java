package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.entity.Employee;


@Component("employeeDaoImple")
public class EmployeeDaoImple implements EmployeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insert(Employee employe) {
		String query = "insert into employee(id, name, city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, employe.getId(), employe.getName(), employe.getCity());
		
		return result;
	}

	public int change(Employee employee) {
		
		String query = "update employee set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, employee.getName(), employee.getCity(), employee.getId());
	
		return result;
	}

	public int delete(int id) {
		
		String query = "delete from employee where id=?";
		int delete = this.jdbcTemplate.update(query, id);		
		return delete;
	}

	// select all obejct data 
	public List<Employee> getAllEmployee() {
		
		String query ="select * from employee";
		List<Employee> employees = this.jdbcTemplate.query(query, new RowMapperImple());
		return employees;

}

	
	// signle data
	
	public Employee getEmployee(int id) {
		String query = "select * from employee where id=?";
		RowMapper rowMapper = new RowMapperImple();
	    Employee employee = this.jdbcTemplate.queryForObject(query,rowMapper, id);
		return employee;
	}


	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	//@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






	
	
	
}
