package com.bear.watchonline.color.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.Color;
@Repository
public class ColorDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	//@SuppressWarnings("unchecked")
	public List<Color> findAll() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Color");
		return q.list();
	}
}
