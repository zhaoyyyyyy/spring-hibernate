package com.bear.watchonline.shoppingCart.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bear.watchonline.entity.ShoppingCar;

@Repository
public class ShoppingCartDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	/*查询购物车订单*/
	public List<ShoppingCar> findAll(){
		Query q=this.sessionFactory.getCurrentSession().createQuery("from ShoppingCar");	
		return q.list();
	}
	/*删除一个订单*/
	public void deleteShop(ShoppingCar sc) {
		this.sessionFactory.getCurrentSession().delete(sc);
	}
	/*通过订单编号查找订单*/
	public ShoppingCar findById(int id) {
		ShoppingCar sh=this.sessionFactory.getCurrentSession().get(ShoppingCar.class,id);
		return sh;		
	}
	/*查询所有购物车订单总数*/
		public int findShopCount(String loginName){
			Query qc=this.sessionFactory.getCurrentSession().createQuery("select COUNT(id) from ShoppingCar where loginName="+loginName);
			Number number = (Number)qc.uniqueResult();
			int count = number.intValue();
			return count;
		} 
	/*更新购物车*/
	public void updateShop(ShoppingCar sc) {
		this.sessionFactory.getCurrentSession().update(sc);
	}
	/*保存购物车*/
	public void saveShop(ShoppingCar sc) {
		this.sessionFactory.getCurrentSession().save(sc);
	}
	/* 清空购物车*/
	public void deleteShoppingCar(String loginName) {
		Query q=this.sessionFactory.getCurrentSession().createQuery("delete from ShoppingCar where loginName="+loginName);
		q.executeUpdate();
	}
}
