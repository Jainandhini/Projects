package com.spendthrift.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="paymentmethods")
public class PaymentMethod implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	int pid;
	int userid;
	String p_name;
	String p_type;
	String p_limit;
	
	@Override
	public String toString(){
		return String.valueOf(pid);
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public String getP_limit() {
		return p_limit;
	}

	public void setP_limit(String p_limit) {
		this.p_limit = p_limit;
	}
	
}
