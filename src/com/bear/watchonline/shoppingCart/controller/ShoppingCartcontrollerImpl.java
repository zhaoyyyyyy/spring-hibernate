package com.bear.watchonline.shoppingCart.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bear.watchonline.entity.ShoppingCar;
import com.bear.watchonline.entity.Watch;
import com.bear.watchonline.shoppingCart.service.ShoppingCartServiceImpl;
import com.bear.watchonline.user.service.UserServiceImpl;

@Controller
public class ShoppingCartcontrollerImpl {
	@Resource
	private ShoppingCartServiceImpl shoppingCartServiceImpl; 
	@Resource
	private UserServiceImpl userServiceImpl;
	
	/*查找未提交订单,进入购物车页面*/
	@RequestMapping("/listShop")
	public String listShop(HttpSession session) throws IOException {
		List<ShoppingCar> shoppingCartList=this.shoppingCartServiceImpl.listAll();
		session.setAttribute("watch", shoppingCartList);        
		/*//分页查询
		int pageCount=this.shoppingCartServiceImpl.findShopPageCount(loginName);
		session.setAttribute("spageCount",pageCount);
		int pageIndex=1;
		session.setAttribute("spageIndex",pageIndex);
		if(0==pageIndex|| pageIndex<0) {
			session.setAttribute("spageIndex",1);				 
		}else {
			session.setAttribute("spageIndex",page);
		}*/
		return "redirect:/product/checkout.jsp";
	}
	
	/*加入购物车，存入数据库*/
	@RequestMapping("/addShop")
	public String addShop(int price,String watchName,String img,@RequestParam("quantity")Integer count,
			HttpSession session,HttpServletRequest request) throws IOException {
		ShoppingCar sh=new ShoppingCar();
		sh.setWatchName(watchName);
		sh.setPrice(price);
		sh.setImg(img);
		sh.setCount(1);
		shoppingCartServiceImpl.addOneWatch(sh);
		/*这个方法只能在watchlist中遍历选择一个展示，而不是把购物车里的东西全部展示*/
		@SuppressWarnings("unchecked")
		List<Watch> list=(List<Watch>) session.getAttribute("watchList");
		
		//List<ShoppingCar> shoppingCartList=this.shoppingCartServiceImpl.listAll();
		//session.setAttribute("watch", shoppingCartList); 
		/*Watch w = new Watch();
		for(Watch wat : list) {
			if(wat.getWatchName().equals(watchName))
				w = wat;
		}*/
		session.setAttribute("watch", list);
		
		return "redirect:/product/checkout.jsp";
	}
	/*修改购买数量*/
	@RequestMapping("/updateCount")
	public String UpdateCoun(@RequestParam("NewCount")Integer count,
			@RequestParam("id")Integer id,
			HttpSession session) throws IOException {
		ShoppingCar sh=this.shoppingCartServiceImpl.findById(id);
		sh.setCount(count);
		this.shoppingCartServiceImpl.updateOneWatch(sh);
		return "redirect:/product/checkout.jsp";
	}
	
	/**
	 * 删除购物车某一订单
	 * @param shopid
	 * @param response
	 * @return 
	 * @throws IOException
	 */
	@RequestMapping("/deleteshop")
	public String deleteShop(@RequestParam("ShopId")Integer shopid) throws IOException {		
		ShoppingCar sh=this.shoppingCartServiceImpl.findById(shopid);
		this.shoppingCartServiceImpl.deleteOneWatch(sh);
		return "redirect:/product/checkout.jsp";		
	}	
	/*清空购物车*/
	@RequestMapping("/deleteShoppingcart")
	public String deleteShoppingcart(String loginName,HttpSession session) throws IOException {	
		this.shoppingCartServiceImpl.deleteSoppingCar(loginName);
		return "redirect:/product/checkout.jsp";
	}		
}
