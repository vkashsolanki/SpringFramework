package com.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.dao.StudentDao;
import com.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program will be started " );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jdbc/config.xml");
        StudentDao studentDao = applicationContext.getBean("studentDaoImpl", StudentDao.class);
        
        List<Student> allStudent = studentDao.getAllStudent();
        for(Student student:allStudent)
        System.out.println(student);
    }
}
