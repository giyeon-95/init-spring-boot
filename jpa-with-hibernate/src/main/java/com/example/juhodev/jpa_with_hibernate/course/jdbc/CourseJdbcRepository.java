package com.example.juhodev.jpa_with_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.juhodev.jpa_with_hibernate.course.Course;

/* 
 * DB class는 @Repository 사용
 */
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    // private static String INSERT_QUERY =

    // """
    // insert into course (id, name, author)
    // values(1, 'Learn AWS','Juhodev');

    // """;

    private static String INSERT_QUERY =

            """
                        insert into course (id, name, author)
                        values(?, ?,?);

                    """;

    private static String DELETE_QUERY =

            """
                        delete from course
                        where id = ?

                    """;

    private static String SELECT_QUERY =

            """
                        select * from course
                        where id = ?

                    """;

    // public void insert() {
    // springJdbcTemplate.update(INSERT_QUERY);
    // }

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(),
                course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    /* 
     * queryForObject : 단일 행 결과를 반환 쿼리 
     * 단일 행을 추출하여 Java 객체로 변환
    */
    public Course findById(long id) {
        // ResultSet -> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);

    }
}
