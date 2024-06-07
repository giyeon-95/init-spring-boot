package com.juhodev.springboot.spring_boot_init;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        /* 
         * Spring boot starter Web will automatically convert the list of courses to JSON
         * (JacksonHttpMeessageConverter is automatically configured by Spring Boot Starter Web)
         */
        return Arrays.asList( 
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "Learn Azure", "in28minutes"),
                new Course(4, "Learn GCP", "in28minutes")
        );
    }
}
