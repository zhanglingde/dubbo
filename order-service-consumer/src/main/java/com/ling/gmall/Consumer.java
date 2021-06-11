package com.ling.gmall;

import com.ling.gmall.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        // 获取服务消费者 xml 配置，获取远程提供的服务信息
        ApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
        // 获取Spring 容器中的 订单服务Bean
        OrderService orderService = ac.getBean(OrderService.class);
        // 初始化订单时，调用远程服务 用户服务获取用户地址
        orderService.initOrder("1");
        System.out.println("调用完成...");
        System.in.read();
    }
}
