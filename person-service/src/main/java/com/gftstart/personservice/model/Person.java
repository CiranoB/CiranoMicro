package com.gftstart.personservice.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "org.hibernate.type.UUIDCharType")
	private UUID uuidPerson;


	private String namePerson;

	private String cpfPerson;

	private int agePerson;

	private String loginPerson;

	private String passwordPerson;


	public Person(UUID uuidPerson, String namePerson, String cpfPerson, int agePerson, String loginPerson,
			String passwordPerson) {
		super();
		this.uuidPerson = uuidPerson;
		this.namePerson = namePerson;
		this.cpfPerson = cpfPerson;
		this.agePerson = agePerson;
		this.loginPerson = loginPerson;
		this.passwordPerson = passwordPerson;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getUuidPerson() {
		return uuidPerson;
	}

	public void setUuidPerson(UUID uuidPerson) {
		this.uuidPerson = uuidPerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getCpfPerson() {
		return cpfPerson;
	}

	public void setCpfPerson(String cpfPerson) {
		this.cpfPerson = cpfPerson;
	}

	public int getAgePerson() {
		return agePerson;
	}

	public void setAgePerson(int agePerson) {
		this.agePerson = agePerson;
	}

	public String getLoginPerson() {
		return loginPerson;
	}

	public void setLoginPerson(String loginPerson) {
		this.loginPerson = loginPerson;
	}

	public String getPasswordPerson() {
		return passwordPerson;
	}

	public void setPasswordPerson(String passwordPerson) {
		this.passwordPerson = passwordPerson;
	}
	
	
	

	

}
