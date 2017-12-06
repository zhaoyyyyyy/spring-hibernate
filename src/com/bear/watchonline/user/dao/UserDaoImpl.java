package com.bear.watchonline.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.UserInfo;
import com.bear.watchonline.entity.UserLogin;

@Repository
public class UserDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
	public void saveUser(UserInfo ui) {
		Session session = sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(ui);
		tr.commit();
		session.close();
	}
	public void saveU(UserLogin ul) {
		Session session = sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(ul);
		tr.commit();
		session.close();
	}
	
	public UserLogin getUserById(String loginName) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserLogin where loginName=?");
		query.setString(0,loginName);
		UserLogin user = (UserLogin) query.uniqueResult();
		session.close();
		return user;
	}
	
	public boolean deleteUser(String loginName) {
		Session session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		tr=session.beginTransaction();
		UserLogin user = session.get(UserLogin.class, loginName);
		System.out.println("UserDaoImpl:"+loginName);
		System.out.println("UserDaoImpl:"+user!=null);		
		session.delete(user);
		tr.commit();
		session.close();
		return true;
	}

	public UserLogin findById(String loginName,String password) {
		Query q = this.sessionFactory.getCurrentSession().createQuery("from UserLogin where loginName=? and password=?");
		q.setString(0,loginName);
		q.setString(1, password);
		UserLogin userLogin = (UserLogin) q.uniqueResult();
        return userLogin;
		//return this.sessionFactory.getCurrentSession().get(UserLogin.class, loginName);
	}
	
	public List<UserLogin> findAll(){
		Query q = this.sessionFactory.getCurrentSession().createQuery("from UserLogin");
		List<UserLogin> list = q.list();
		return list;
	}
	
}
