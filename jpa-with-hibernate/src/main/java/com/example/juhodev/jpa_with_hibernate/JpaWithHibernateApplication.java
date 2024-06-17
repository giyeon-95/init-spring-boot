package com.example.juhodev.jpa_with_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWithHibernateApplication {

	/*
	 * 정적 URL 구성 전, 아래 URL을 사용하여 H2 데이터베이스에 접속. (설정후 Run -> localhost:8080/h2-console 접속)
	 * 
	 * 실행시에 아래와 같은 로그가 출력되는데, 이는 H2 데이터베이스의 URL을 의미한다.
	 * (실행시마다 다른 URL이 출력된다. -> 정적 URL 구성 가능)
	 * 
	 * terminal console : url=jdbc:h2:mem:b2239cb8-269d-4214-b2b5-1fbd3afd912a
	 * Set JDBC URL = jdbc:h2:mem:b2239cb8-269d-4214-b2b5-1fbd3afd912a
	 * CONNECT
	 */

	/*
	 * 정적 URL 구성
	 * application.properties 에서 정적 URL 설정후, 아래 URL을 사용하여 H2 데이터베이스에 접속.
	 * Set JDBC URL = jdbc:h2:mem:testdb
	 * CONNECT
	 */

	/*
	 * TABLE 생성
	 * resources/schema.sql 파일에 SQL문을 작성
	 * RE CONNECT -> TABLE 생성 확인
	 */

	public static void main(String[] args) {
		SpringApplication.run(JpaWithHibernateApplication.class, args);
	}

}
