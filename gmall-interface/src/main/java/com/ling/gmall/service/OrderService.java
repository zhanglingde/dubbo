package com.ling.gmall.service;

import com.ling.gmall.bean.UserAddress;

import java.util.List;


/**
 * 订单服务接口
 */
public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	List<UserAddress> initOrder(String userId);

}
