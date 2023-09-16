package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();

        // insert
        student.setId(3464);
        student.setName("Babul");
        int insertResult = studentDao.insert(student);

        // update
        student.setId(1234);
        student.setName("Dibyajyoti M");
        int updateResult = studentDao.update(student);

        // delete
        student.setId(1234);
        int deleteResult = studentDao.delete(student);

        System.out.println("Rows Added/Updated: " + insertResult);
        System.out.println("Rows Added/Updated: " + updateResult);
        System.out.println("Rows Added/Updated: " + deleteResult);
    }
}
