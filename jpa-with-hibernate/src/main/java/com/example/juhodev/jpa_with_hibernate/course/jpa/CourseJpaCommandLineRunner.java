package com.example.juhodev.jpa_with_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.juhodev.jpa_with_hibernate.course.Course;
import com.example.juhodev.jpa_with_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

/* 
 * Spring App 시작시 실행될 로직이 있는 경우 CommandLineRunner 사용
 */

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // repository.insert(new Course(1, "Learn AWS Jpa!", "in28minutes"));
		// repository.insert(new Course(2, "Learn Azure Jpa!", "in28minutes"));
		// repository.insert(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

        repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
		repository.save(new Course(2, "Learn Azure Jpa!", "in28minutes"));
		repository.save(new Course(3, "Learn DevOps Jpa!", "in28minutes"));
		
		repository.deleteById(1l);
		
        /* 2l, 3l : Long Type */
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));


		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));

		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn DevOps Jpa!"));

        
    }

}
