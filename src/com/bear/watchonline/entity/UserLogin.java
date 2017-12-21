package com.bear.watchonline.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="UserLogin")
public class UserLogin {
	
	private String loginName;
	private String password;

	private UserInfo userInfo;
	//private Set<Log> lSet = new HashSet<Log>();
	//private Set<Order> oSet = new HashSet<Order>();
	private ShoppingCar shoppingCar;
	
	@Id
	@GenericGenerator(name="loginId", strategy="assigned")
	@GeneratedValue(generator="loginId")
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="loginName")
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	public ShoppingCar getShoppingCar() {
		return shoppingCar;
	}
	public void setShoppingCar(ShoppingCar shoppingCar) {
		this.shoppingCar = shoppingCar;
	}
	/*public UserLogin(String loginName, String password UserInfo userInfo, ShoppingCar shoppingCar) {
		super();
		this.loginName = loginName;
		this.password = password;
		//this.userInfo = userInfo;
		//this.shoppingCar = shoppingCar;
	}*/

	
}
