package com.gftstart.personservice.model;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Bookkeeper extends Person {

	private boolean statusBookkeeper;
	
	private String registerBookkeeper;

	public Bookkeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookkeeper(UUID uuidPerson, String namePerson, String cpfPerson, int agePerson, String loginPerson,
			String passwordPerson) {
		super(uuidPerson, namePerson, cpfPerson, agePerson, loginPerson, passwordPerson);
		// TODO Auto-generated constructor stub
	}

	public boolean isStatusBookkeeper() {
		return statusBookkeeper;
	}

	public void setStatusBookkeeper(boolean statusBookkeeper) {
		this.statusBookkeeper = statusBookkeeper;
	}

	public String getRegisterBookkeeper() {
		return registerBookkeeper;
	}

	public void setRegisterBookkeeper(String registerBookkeeper) {
		this.registerBookkeeper = registerBookkeeper;
	}
	
	
	
}
