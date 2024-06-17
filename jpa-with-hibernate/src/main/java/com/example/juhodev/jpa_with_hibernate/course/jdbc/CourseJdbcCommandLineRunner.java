package com.example.juhodev.jpa_with_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.juhodev.jpa_with_hibernate.course.Course;

/* 
 * Spring App 시작시 실행될 로직이 있는 경우 CommandLineRunner 사용
 */

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Spring", "Juho"));
        repository.deleteById(1);
    }

}
