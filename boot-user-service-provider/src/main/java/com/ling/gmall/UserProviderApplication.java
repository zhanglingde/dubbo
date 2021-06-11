package com.ling.gmall;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 开启基于注解的dubbo功能

@EnableDubbo(scanBasePackages = "com.ling.gmall")
@SpringBootApplication
public class UserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderApplication.class, args);
	}

}
