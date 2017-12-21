package com.bear.watchonline.entity;

public class Page {
	private int totalcount;//全部条数
	private int pagecount=6;//每页显示的条数
	private int totalpage;//总页数
	private int dpage;//当前页数
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage() {
		if(totalcount%pagecount==0) {
			this.totalpage = totalpage;//整除
		}else {
			//不能整除，创建新的一页
			this.totalpage = totalcount/pagecount+1;
		}
	}
	public int getDpage() {
		return dpage;
	}
	public void setDpage(int dpage) {
		this.dpage = dpage;
	}
}
