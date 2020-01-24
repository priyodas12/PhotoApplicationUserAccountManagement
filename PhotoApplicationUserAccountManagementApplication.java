package com.workspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhotoApplicationUserAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoApplicationUserAccountManagementApplication.class, args);
	}

}
