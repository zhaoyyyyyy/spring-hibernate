package com.bear.watchonline.log.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.bear.watchonline.entity.Log;
@Repository
public class LogDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	//@SuppressWarnings("unchecked")告诉编译器忽略指定的警告，不用在编译完成后出现警告信息
	public List<Log> findAll() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Log");
		return q.list();
	}
}
