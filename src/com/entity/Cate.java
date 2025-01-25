package com.entity;

import java.util.ArrayList;
import java.util.List;

import com.util.VeDate;

public class Cate {
	private String cateid = "C" + VeDate.getStringId();
	private String catename;
	private String memo;
	private List<Goods> goodsList = new ArrayList<Goods>();

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	public String getCateid() {
		return cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
