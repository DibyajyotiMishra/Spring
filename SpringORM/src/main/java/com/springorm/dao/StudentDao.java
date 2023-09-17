package com.springorm.dao;

import com.springorm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student) {
        return (Integer) this.hibernateTemplate.save(student);
    }

    public Student getStudent(int studentId) {
        return (Student) this.hibernateTemplate.get(Student.class, studentId);
    }

    public List<Student> getStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    public int  delete(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        if (student != null) {
            this.hibernateTemplate.delete(student);
            return 1;
        }
        return 0;
    }

    @Transactional
    public int update(Student student) {
        this.hibernateTemplate.update(student);
        return 1;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
