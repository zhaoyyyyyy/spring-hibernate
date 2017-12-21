package com.bear.watchonline.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Order")
public class Order {
	private int id;
	private String watchName;
	private int price;
	private UserLogin userLogin;
	private OrderDetail orderDetail;
	@Id
	@GenericGenerator(name="loginId", strategy="increment")
	@GeneratedValue(generator="loginId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWatchName() {
		return watchName;
	}
	public void setWatchName(String watchName) {
		this.watchName = watchName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@ManyToOne
	@JoinColumn(name="loginName")
	public UserLogin getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
	//单向一对一
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="id")
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	
}
