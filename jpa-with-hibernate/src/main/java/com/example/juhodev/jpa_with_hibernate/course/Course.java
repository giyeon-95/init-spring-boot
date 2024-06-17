package com.example.juhodev.jpa_with_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/* 
 * Bean 과 테이블 이름을 다르게 하고싶으면 아래처럼 name 설정 가능
 */

// @Entity (name = "Course_Details")
@Entity
public class Course {

    @Id
    private long id;

    private String name;

    /* table col 이름과 일치시켜야하는 경우 @Column 사용 가능 (일치하므로 불요) */
    @Column(name = "author")
    private String author;

    /* 인수 없는 생성자 */
    public Course() {

    }

    /* 인수 생성자 */
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

    // constructor
    // getters
    // toString
}
