package com.ling.gmall.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ling.gmall.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        //1.查询用户的收货地址
        List<UserAddress> addresses = userService.getUserAddressList(userId);
        for (UserAddress address : addresses) {
            System.out.println(address.getUserAddress());
        }
        return addresses;
    }
}
