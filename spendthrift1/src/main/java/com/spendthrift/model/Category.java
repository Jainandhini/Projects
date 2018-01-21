package com.spendthrift.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="category")
public class Category implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	String userid;
	int category_id;
	String category_type;
	float category_limit;
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_type() {
		return category_type;
	}

	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}

	public float getCategory_limit() {
		return category_limit;
	}

	public void setCategory_limit(float category_limit) {
		this.category_limit = category_limit;
	}

	
	
	@Override
	public String toString(){
		return String.valueOf(category_id);
	}
}
