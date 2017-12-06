package com.bear.watchonline.order.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.Order;
import com.bear.watchonline.entity.UserLogin;
@Repository
public class OrderDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	private Transaction tx;
	
/*	@SuppressWarnings("unchecked")*/
	public List<Order> findAll() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Order");
		return q.list();
	}
	public List<Order> getOrderByUserId(String loginName){
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Order");
		q.setString(0, loginName);
		return q.list();
	}
	public UserLogin getUser(String loginName) {
		Session session =sessionFactory.openSession();
		Order order = session.get(Order.class, loginName);
		UserLogin user = order.getUserLogin();
		session.close();
		return user;
	}
}
