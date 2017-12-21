package com.bear.watchonline.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.Admin;

@Repository
public class AdminDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	private Transaction tx;
	
	public List<Admin> findAll(){
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Admin");
		List<Admin> list = q.list();
		return list;
	}
	
	public Admin findByNamePsd(String name, String psd) {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from Admin where name=? and password=?");
		q.setString(0,name);
		q.setString(1, psd);
		Admin admin = (Admin) q.uniqueResult();
        return admin;
	}
	
	public boolean updateAdmin(Admin admin) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(admin);
		tx.commit();
		session.close();
		return true;
	}
	
	public boolean addAdmin(Admin admin) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(admin);
		tx.commit();
		session.close();
		return true;
	}
	
	public boolean deleteAdmin(Admin admin) {
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.delete(admin);
		tx.commit();
		session.close();
		return true;
	}
}
