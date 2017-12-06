package com.bear.watchonline.order.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.Order;
import com.bear.watchonline.entity.UserLogin;
import com.bear.watchonline.order.dao.OrderDaoImpl;
@Service
@Transactional(readOnly=true)
public class OrderServiceImpl {
	@Resource
	private OrderDaoImpl odi;
	
	public List<Order> findAll() {
		return this.odi.findAll();
	}
	public List<Order> getOrderByUserid(String loginName){
		return odi.getOrderByUserId(loginName);
	}
	public UserLogin getUser(String loginName) {
		return odi.getUser(loginName);
	}
}
