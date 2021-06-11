# 模块介绍
- gmall-interface：dubbo 公共接口定义

Spring 整合 dubbo：
- user-service-provider：服务提供者，提供查询用户地址接口
- order-service-consumer：服务消费者，初始化订单时，远程调用用户服务获取地址信息

SpringBoot 整合 dubbo：
- boot-user-service-provider：服务提供者
- boot-order-service-consumer：服务消费者