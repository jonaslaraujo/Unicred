package br.com.jonaslaraujo.unicred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UnicredApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnicredApplication.class, args);
	}

}
