package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentId;
        String studentName;
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
        StudentDao studentDao = context.getBean("student", StudentDao.class);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Welcome to Student Manager");
            System.out.println("Choose from one option: ");
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Student");
            System.out.println("3. Get a Student's Data");
            System.out.println("4. Get all Students' Data");
            System.out.println("5. Update Student Data");
            System.out.println("6. Exit");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Student ID");
                    studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student name");
                    studentName = scanner.nextLine();
                    Student student = new Student(studentId, studentName);
                    int rowId = studentDao.insert(student);
                    System.out.println("Added Student with ID " + rowId);
                    break;
                case 2:
                    System.out.println("Enter Student ID");
                    studentId = scanner.nextInt();
                    int result = studentDao.delete(studentId);
                    System.out.println("No. of rows affected: " + result);
                    break;
                case 3:
                    System.out.println("Enter Student ID");
                    studentId = scanner.nextInt();
                    System.out.println(studentDao.getStudent(studentId));
                    break;
                case 4:
                    System.out.println(studentDao.getStudents());
                    break;
                case 5:
                    System.out.println("Enter student ID");
                    studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student Name");
                    studentName = scanner.nextLine();
                    Student newStudent = new Student(studentId, studentName);
                    int res = studentDao.update(newStudent);
                    System.out.println("No. of rows affected: " + res);
                    break;
                case 6:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option. Try again...");
                    break;
            }
        }
    }
}
