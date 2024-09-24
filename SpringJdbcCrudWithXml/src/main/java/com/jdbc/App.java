package com.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeDao;
import com.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "CRUD JOIURNEY START FROM HERE ");
        
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jdbc/config.xml");      
        EmployeDao employeDao = applicationContext.getBean("employeeDaoImpl" , EmployeDao.class);
        
        // insert data
        
        
        // Take input From user with Scanner 
        System.out.println( "+++++++++++++++++++++++ Data Insert Here +++++++++++++++++++++" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee id");
        int id = scanner.nextInt();
        System.out.println("Enter the Employee Name");
        String name = scanner.next().trim();
        System.out.println("Enter the Employee City");
        String city = scanner.next().trim();
        Employee employee = new Employee(id,name,city);
        int insert = employeDao.insert(employee);
        System.out.println("Inserted Data Successfully !..."+insert);
//        
//
//        
//        // update data
//        // Take input From user with Scanner 
//        System.out.println( "+++++++++++++++++++++++ Data Update Here +++++++++++++++++++++" );
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Update the Employee id");
//        int id1 = scanner2.nextInt();
//        System.out.println("Update the Employee Name");
//        String name1 = scanner2.next().trim();
//        System.out.println("Update the Employee City");
//        String city1 = scanner2.next().trim();
//        Employee employee2 = new Employee(id1,name1,city1);
//        int update = employeDao.change(employee2);
//        
//        System.out.println("Update Succeefully Successfully !..."+update);
//        
//        //delete data
//        
//      // Take input From user with Scanner
//      System.out.println( "+++++++++++++++++++++++ Data Delete Here +++++++++++++++++++++" );
//      Scanner scanner1 = new Scanner(System.in);
//      System.out.println("Delete the Employee id");
//      int id2 = scanner1.nextInt();
//
//     //Employee employee2 = new Employee(id1);
//      int delete = employeDao.delete(id2);
//      
//      System.out.println("Delete Successfully !..."+delete);
//      System.out.println("Thank You For Using Crud Operations Here Welcome");
      
      
       System.out.println( "+++++++++++++++++++++++ Show All DATA Here +++++++++++++++++++++" );
       //Employee employee3 = new Employee();
       List<Employee> employee1 = employeDao.getAllEmployee();
       for(Employee employees:employee1)
       {
    	   System.out.println(employees);
       }
      
//       
//       System.out.println( "+++++++++++++++++++++++ Show Only Single DATA Here +++++++++++++++++++++" );
//       // select query for single data fetch       
//       Employee employee2 = employeDao.getEmployee(500);
//       System.out.println(employee2);
        
        
        
        
        
        
        
    }
}
