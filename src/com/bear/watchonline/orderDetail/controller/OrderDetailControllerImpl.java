package com.bear.watchonline.orderDetail.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.OrderDetail;
import com.bear.watchonline.order.service.OrderServiceImpl;
import com.bear.watchonline.orderDetail.service.OrderDetailServiceImpl;

@Controller
public class OrderDetailControllerImpl {
	@Resource
	private OrderDetailServiceImpl ods;
	@Resource
	private OrderServiceImpl os;
	
	@RequestMapping("/getOrderDetail")
	public String getOrderDetail(HttpServletRequest request,int id) {
		List<OrderDetail> list= ods.getById(id);
		request.getSession().setAttribute("detailList", list);
//		for(int i=0;i<list.size();i++) {
//			int size=list.get(i).getBook().size();
//			for(int j=0;j<size;j++) {
//				System.out.println("name:"+list.get(i).getBook().get(j).getName());
//			}
//		}
		return "redirect:/admin/orderDetail.jsp";
	}
}
