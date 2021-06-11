package com.ling.gmall.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.ling.gmall.bean.UserAddress;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 用户服务提供查询地址：查询所有用户地址，此处写死
 */
@Service    // 暴露服务
@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return Arrays.asList(address1,address2);
	}

}