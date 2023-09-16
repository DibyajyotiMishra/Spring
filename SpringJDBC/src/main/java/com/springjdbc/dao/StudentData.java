package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentData implements StudentDao{
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into  student(id, name) values(?, ?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=? where id=?";
        int result = this.jdbcTemplate.update(query, student.getName(), student.getId());
        return result;
    }

    @Override
    public int delete(Student student) {
        String query = "delete from student where id=?";
        int result = this.jdbcTemplate.update(query, student.getId());
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
