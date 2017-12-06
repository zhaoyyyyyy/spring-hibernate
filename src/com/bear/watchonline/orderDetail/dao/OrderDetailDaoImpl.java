package com.bear.watchonline.orderDetail.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.OrderDetail;

@Repository
public class OrderDetailDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	private Transaction tx;
	
	public List<OrderDetail> getByOrderId(int id) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from OrderDetail where id=?");
		query.setInteger(0, id);
		List<OrderDetail> list = query.list();
		session.close();
		return list;
	}
}
