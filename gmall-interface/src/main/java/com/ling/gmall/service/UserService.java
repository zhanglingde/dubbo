package com.ling.gmall.service;

import java.util.List;
import com.ling.gmall.bean.UserAddress;

/**
 * 用户服务接口
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

}
