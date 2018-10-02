package com.example.uppercase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class UppercaseApp {

	@Bean
	Function<Flux<String>, Flux<String>> uppercase() {
		return (in) -> in.map(s->s.toUpperCase()+"!");
	}

	public static void main(String[] args) {
		SpringApplication.run(UppercaseApp.class, args);
	}
}
