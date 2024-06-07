package com.juhodev.springboot.spring_boot_init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootInitApplication {

	/* 
	 *  Actuator 라이브러리를 추가하면, /actuator/health 엔드포인트를 통해 애플리케이션의 상태를 확인할 수 있다.
	 *  http://localhost:8080/actuator 을 통해 확인 가능
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitApplication.class, args);
	}

}
