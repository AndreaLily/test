package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer
//@SpringBootApplication
//public class EurekaServerApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(EurekaServerApplication.class, args);
//	}
//}

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EurekaServerApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}