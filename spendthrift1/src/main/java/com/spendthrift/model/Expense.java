package com.spendthrift.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="transaction")
public class Expense implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	int eid;
	int category_id;
	int user_id;
	int payment_id;
	String date="";
	float amount;
	String comments="";
	
	@Override
	public String toString(){
		return String.valueOf(eid);
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
	
	
	

}
