package com.bear.watchonline.orderDetail.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bear.watchonline.entity.OrderDetail;
import com.bear.watchonline.orderDetail.dao.OrderDetailDaoImpl;

@Service
public class OrderDetailServiceImpl {
	@Resource
	private OrderDetailDaoImpl oddi;
	
	public List<OrderDetail> getById(int id){
		return oddi.getByOrderId(id);
	}
}
