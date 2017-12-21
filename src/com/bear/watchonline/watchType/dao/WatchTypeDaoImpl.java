package com.bear.watchonline.watchType.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.WatchType;

@Repository
public class WatchTypeDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	//查找所有type
	public List<WatchType> findAll() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from WatchType");
		return q.list();
	}
	//通过name查找type
	public WatchType getByName(String typeName) {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from WatchType where typeName = ?");
		q.setString(0, typeName);
		WatchType wt=(WatchType) q.uniqueResult();
		return wt;
	}
	
	public WatchType getById(int id) {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from WatchType where typeId=?");
		q.setInteger(0, id);
		WatchType wt=(WatchType) q.uniqueResult();
		return wt;
	}
	
	public boolean addWatchType(WatchType wt) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(wt);
		tx.commit();
		session.close();
		return true;
	}
}
