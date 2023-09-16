package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = context.getBean("student", StudentDao.class);
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

        // read
        Student studentData = studentDao.getStudent(1349);
        List<Student> students = studentDao.getStudents();

        System.out.println("Rows Added/Updated: " + insertResult);
        System.out.println("Rows Added/Updated: " + updateResult);
        System.out.println("Rows Added/Updated: " + deleteResult);
        System.out.println(studentData);
        System.out.println(students);
    }
}
