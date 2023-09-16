package com.springjdbc.dao;

import com.springjdbc.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(Student student);
    public Student getStudent(int studentId);
    public List<Student> getStudents();
}
