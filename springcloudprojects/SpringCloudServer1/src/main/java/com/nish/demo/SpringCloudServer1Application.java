package com.nish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer1Application.class, args);
	}

}
