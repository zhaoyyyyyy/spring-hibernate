package com.bear.watchonline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Watch")
public class Watch {
	private String watchName;
	private int price;

	private WatchType watchType;//一
	private Color color;//一
	@Id
	@GenericGenerator(name="watchId", strategy="assigned")
	@GeneratedValue(generator="watchId")
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
	//单向多对一
	@ManyToOne(targetEntity=WatchType.class)   //指定关联对象
	@JoinColumn(name="typeId")
	public WatchType getWatchType() {
		return watchType;
	}
	public void setWatchType(WatchType watchType) {
		this.watchType = watchType;
	}

	//单向多对一
	@ManyToOne(targetEntity=Color.class)   //指定关联对象
	@JoinColumn(name="colorId")
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
