package com.app.service.appservice1;

import com.app.service.appservice1.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "web2", configuration = RibbonConfiguration.class)
public class AppService1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppService1Application.class, args);
	}

}
