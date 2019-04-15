package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.main","com.example"})
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.example.repositories")
@EntityScan("com.example.entities")
@ComponentScan("com")
public class MeteorApplication {

	public static void main(String[] args) {
        SpringApplication.run(MeteorApplication.class, args);
    }


}
