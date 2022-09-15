package com.gftstart.bookkeeperservice.VO;

import com.gftstart.bookkeeperservice.model.Pay;

public class ResponseTemplateVO {

	private Pay pay;
	private User user;
	
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public ResponseTemplateVO(Pay pay, User user) {
		super();
		this.pay = pay;
		this.user = user;
	}
	
	public ResponseTemplateVO() {
		super();
	}
	
	
	
}
