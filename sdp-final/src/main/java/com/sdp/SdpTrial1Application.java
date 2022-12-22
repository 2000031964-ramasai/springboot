package com.sdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
@SpringBootApplication

public class SdpTrial1Application {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/sdp-trial-1-0.0.1-SNAPSHOT");
		SpringApplication.run(SdpTrial1Application.class, args);
		System.out.println("Server Started!!");
	}

}
