package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/config.xml");
		EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);

		// data save

		Employee employee = new Employee();
		employee.setId(300);
		employee.setName("Sohan");
		employee.setCity("Kolkata");
		// insert method employee ka object pass krke ek variable me hold kar le
		int result = employeeDao.insert(employee);
		System.out.println(result);
	}
}
