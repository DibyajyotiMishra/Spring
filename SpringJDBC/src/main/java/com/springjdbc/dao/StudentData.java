package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
public class StudentData implements StudentDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final RowMapper<Student> rowMapper = new RowMapperImplementation();
    @Override
    public int insert(Student student) {
        String query = "insert into  student(id, name) values(?, ?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName());
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=? where id=?";
        return this.jdbcTemplate.update(query, student.getName(), student.getId());
    }

    @Override
    public int delete(Student student) {
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query, student.getId());
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        return this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
    }

    @Override
    public List<Student> getStudents() {
        String query = "select * from student";

        return this.jdbcTemplate.query(query, rowMapper);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
