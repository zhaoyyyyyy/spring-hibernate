package com.bear.watchonline.shoppingCart.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.ShoppingCar;
import com.bear.watchonline.shoppingCart.dao.ShoppingCartDaoImpl;

@Service
@Transactional(readOnly=false)
public class ShoppingCartServiceImpl {
	@Resource
	private ShoppingCartDaoImpl shoppingCartDaoImpl;
	/*查找所有购物车商品*/
	public List<ShoppingCar> listAll(){
		return this.shoppingCartDaoImpl.findAll();
	}
    /*通过id查找订单*/
	public ShoppingCar findById(int id) {
		return this.shoppingCartDaoImpl.findById(id);
	}
	/*删除一个手表订单*/
	public void deleteOneWatch(ShoppingCar sc) {
		this.shoppingCartDaoImpl.deleteShop(sc);
	}
    /*清空购物车*/
	public void deleteSoppingCar(String loginName) {
		this.shoppingCartDaoImpl.deleteShoppingCar(loginName);
	}
	/*查找购物车未提交订单页数*/
	public int findShopPageCount(String loginName) {
		if((this.shoppingCartDaoImpl.findShopCount(loginName))%3==0) {
		return (int)(this.shoppingCartDaoImpl.findShopCount(loginName)/3);
		}else {
		return (int)(this.shoppingCartDaoImpl.findShopCount(loginName)/3+1);	
		}
	}	
    /*更新一个手表订单*/
		public void updateOneWatch(ShoppingCar sc) {
			this.shoppingCartDaoImpl.updateShop(sc);
		}
	/*增加手表*/
		public void addOneWatch(ShoppingCar sc) {
			this.shoppingCartDaoImpl.saveShop(sc);
		}		
}
