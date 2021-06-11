package com.ling.gmall;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dubbo 服务提供者
 */
public class Provider {
	
	public static void main(String[] args) throws IOException {
		// 加载 xml配置文件，指定需要暴露的服务，即服务要注册的注册中心
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		
		System.in.read();
	}

}
