package com.bear.watchonline.watch.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.Page;
import com.bear.watchonline.entity.Watch;
@Repository
public class WatchDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	private Transaction tx;
	
	public List<Watch> findAll() {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Watch");
		return q.list();
	}
	
	public List<Watch> getWatchByPartName(String watchName){
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Watch where watchName like ?");
		q.setString(0, "%"+watchName+"%");
		return q.list();
	}
	
	public boolean addWatch(Watch watch) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(watch);
		tx.commit();
		session.close();
		return true;
	}
	
	public boolean deleteWatch(Watch watch) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.delete(watch);
		tx.commit();
		session.close();
		return true;
	}
	
	public boolean editorWatch(Watch watch) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(watch);
		tx.commit();
		session.close();
		return true;
	}
	
	public Watch findByName(String watchName) {
		Session session = sessionFactory.openSession();
		Watch watch = session.get(Watch.class, watchName);
		session.close();
		return watch;
	}
	
	public int getWatchCount() {
		return findAll().size();
	}
	
	public List<Watch> selectByPage(Page page) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Watch");
		List<Watch> list = q.setFirstResult((page.getDpage()-1)*page.getPagecount())
				.setMaxResults(page.getPagecount()).list();
		session.close();
		return list;
	}
}
