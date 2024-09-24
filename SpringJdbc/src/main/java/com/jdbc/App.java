package com.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbc.dao.RowMapperImpl;
import com.jdbc.dao.StudentDao;
import com.jdbc.entity.Student;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My programm has been started");    
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class); 
        
        
        
        
        
        
        // select query for single data fetch       
        Student student2 = studentDao.getStudent(105);
        System.out.println(student2);
        
        // select query for multiple data fetch
        
        
        // select multiple data 
        List<Student> allStudent = studentDao.getAllStudent();
        // foreach se ek ek data list me print kar lenge becoz Student type hai student type ka hi refrence pass karenge foreach me
        // allStudent - isme se data ek-ek list me ayega aour print hoga
        for(Student students:allStudent)
        {
            System.out.println(students);
        }
        

        
     
        
        
            //delete data
        	
        	 //Student student = new Student(); 
        	 
        	 // take input from user
//        	 Scanner sc = new Scanner(System.in);
//        	 System.out.println("enter the id numer");
//        	 int id = sc.nextInt();
//        	 student.setId(id);
        	 
//        	 Scanner sc = new Scanner(System.in);
//        	 System.out.println("Enter the Id Number");
//        	 int id = sc.nextInt();
//        	 
//        	 int delete = studentDao.delete(id);
//        	 System.out.println("Data has been deleted ......"+delete);
//        	 
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
        
       
        
//        try {
//            StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);        
//            // Student ka object le 
//            Student student = new Student();
//            student.setId(420);
//            student.setName("Kundan kumar");
//            student.setCity("Bhopal");
//            
//            int result = studentDao.change(student);
//            System.out.println("Data Changed"+result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
       
//        // data save
//        Student student = new Student();
//        student.setId(110);
//        student.setName("MohanDasgandhi");
//        student.setCity("Porbandar");
//        //student se insert method ko call krke Studetn ka object pass krke ek varible me hold kare
//        int result = studentDao.insert(student);
//        System.out.println(result);
        
    }
}
