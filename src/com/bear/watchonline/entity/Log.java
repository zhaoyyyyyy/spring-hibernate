package com.bear.watchonline.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Log")
public class Log {
	private int id;
	private UserLogin userLogin;
	private Date time;
	private String action;
/*	@Id
	@GenericGenerator(name="foreign", strategy="foreign", parameters={@Parameter(name="property", value="userLogin")})
	@GeneratedValue(generator="foreign")*/
	@Id
	@GenericGenerator(name="loginId", strategy="increment")
	@GeneratedValue(generator="loginId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//单向多对一
		@ManyToOne(targetEntity=UserLogin.class)   //指定关联对象
		@JoinColumn(name="loginName")
	public UserLogin getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
