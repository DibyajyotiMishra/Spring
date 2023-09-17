package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
        StudentDao studentDao = context.getBean("student", StudentDao.class);
        Student student = new Student(5467, "Babul");
        int result = studentDao.insert(student);
        System.out.println("Row ID created/updated/deleted: " + result);
    }
}
