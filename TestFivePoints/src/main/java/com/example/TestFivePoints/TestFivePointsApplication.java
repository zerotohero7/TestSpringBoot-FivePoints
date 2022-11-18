
package com.example.TestFivePoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestFivePointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestFivePointsApplication.class, args);
	}

}
