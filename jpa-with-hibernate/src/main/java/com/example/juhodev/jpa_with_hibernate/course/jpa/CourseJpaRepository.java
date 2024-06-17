package com.example.juhodev.jpa_with_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.example.juhodev.jpa_with_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


/* 
 * JPA로 쿼리를 실행할 경우 @Transactional로 트랜잭션을 사용
 */
@Repository
@Transactional
public class CourseJpaRepository {

    
    /* 
     * EntityManager로 엔티티 관리.
     * AutoWired 대신 더 구체적인 어노테이션인 PersistenceContext 사용가능.)
     */
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
