package com.example.juhodev.jpa_with_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.juhodev.jpa_with_hibernate.course.Course;

/* 
 * CourseSpringDataJpaRepository는 단순히 interface만 적용하면 사용가능.
 * EntityManager, method 정의 불요
 */
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

    /* 
     * Custom method 정의 가능.
     */


     List<Course> findByAuthor(String author);
     List<Course> findByName(String name);
}
