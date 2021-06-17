package com.jtalltree.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventmanagementApiApplication.class, Jsr310JpaConverters.class})
public class EventmanagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApiApplication.class, args);
	}

}
