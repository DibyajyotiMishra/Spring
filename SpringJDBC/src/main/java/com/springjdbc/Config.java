package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.springjdbc")
public class Config {
    @Bean(name = {"database-config"})
    public DataSource getDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
    dataSource.setUsername("root");
    dataSource.setPassword("password");
    return dataSource;
    }

    @Bean(name = {"dataSource"})
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean(name = { "studentDao" })
    public StudentDao getStudentDao() {
        StudentData studentDao = new StudentData();
        studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}
