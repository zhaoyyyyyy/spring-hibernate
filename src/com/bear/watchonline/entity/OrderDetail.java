package com.bear.watchonline.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="OrderDetail")
public class OrderDetail {
	private int id;
	private int count;
	private List<Watch> watch = new ArrayList<Watch>();
	
	@Id
	@GenericGenerator(name="loginId", strategy="increment")
	@GeneratedValue(generator="loginId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//双向一对多
	@OneToMany(targetEntity=Watch.class,cascade=CascadeType.ALL)
	@OrderColumn(name="ORDERINDEX")
	public List<Watch> getWatch() {
		return watch;
	}
	public void setWatch(List<Watch> watch) {
		this.watch = watch;
	}
	
}
