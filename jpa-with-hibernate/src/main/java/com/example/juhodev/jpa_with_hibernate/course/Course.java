package com.example.juhodev.jpa_with_hibernate.course;

import jakarta.persistence.Id;

public class Course {

    @Id
    private long id;

    private String name;

    private String author;

    /* 인수 없는 생성자 */
    public Course() {

    }

    /* 인수 생성자  */
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
