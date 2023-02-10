package com.chatapp.chatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath: ./../resources/application.yml")
public class ChatserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChatserverApplication.class, args);
	}

}
