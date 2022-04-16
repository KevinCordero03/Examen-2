package com.cenfotec.lab5.lab5;

import com.cenfotec.lab5.lab5.domain.Author;
import com.cenfotec.lab5.lab5.repository.AuthorRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab5Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab5Application.class, args);
	}


}
