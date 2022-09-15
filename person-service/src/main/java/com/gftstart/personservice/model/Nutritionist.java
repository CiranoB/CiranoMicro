package com.gftstart.personservice.model;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Nutritionist extends Person{
	
	private String crnNutritionist;
	
	private boolean statusNutritionist;

	private String registerNutritionist;

	public String getCrnNutritionist() {
		return crnNutritionist;
	}

	public void setCrnNutritionist(String crnNutritionist) {
		this.crnNutritionist = crnNutritionist;
	}

	public boolean isStatusNutritionist() {
		return statusNutritionist;
	}

	public void setStatusNutritionist(boolean statusNutritionist) {
		this.statusNutritionist = statusNutritionist;
	}

	public String getRegisterNutritionist() {
		return registerNutritionist;
	}

	public void setRegisterNutritionist(String registerNutritionist) {
		this.registerNutritionist = registerNutritionist;
	}

	public Nutritionist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nutritionist(UUID uuidPerson, String namePerson, String cpfPerson, int agePerson, String loginPerson,
			String passwordPerson) {
		super(uuidPerson, namePerson, cpfPerson, agePerson, loginPerson, passwordPerson);
		// TODO Auto-generated constructor stub
	}

	public Nutritionist(UUID uuidPerson, String namePerson, String cpfPerson, int agePerson, String loginPerson,
			String passwordPerson, String crnNutritionist, boolean statusNutritionist, String registerNutritionist) {
		super(uuidPerson, namePerson, cpfPerson, agePerson, loginPerson, passwordPerson);
		this.crnNutritionist = crnNutritionist;
		this.statusNutritionist = statusNutritionist;
		this.registerNutritionist = registerNutritionist;
	}

	

}
