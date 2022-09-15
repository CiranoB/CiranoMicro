package com.gftstart.bookkeeperservice.VO;

import java.util.UUID;

public class User {
	
	private boolean statusUser;
	
	private String objectiveUser;
	
	private int heightUser;
	
	private Float weightUser;
	
	private Float bmrUser;

	private String restrictionUser;
	
	private String costUser;

	private UUID uuidPerson;

	public User(boolean statusUser, String objectiveUser, int heightUser, Float weightUser, Float bmrUser,
			String restrictionUser, String costUser, UUID uuidPerson, String namePerson, String cpfPerson,
			int agePerson, String loginPerson, String passwordPerson) {
		super();
		this.statusUser = statusUser;
		this.objectiveUser = objectiveUser;
		this.heightUser = heightUser;
		this.weightUser = weightUser;
		this.bmrUser = bmrUser;
		this.restrictionUser = restrictionUser;
		this.costUser = costUser;
		this.uuidPerson = uuidPerson;
		this.namePerson = namePerson;
		this.cpfPerson = cpfPerson;
		this.agePerson = agePerson;
		this.loginPerson = loginPerson;
		this.passwordPerson = passwordPerson;
	}

	private String namePerson;

	private String cpfPerson;

	private int agePerson;

	private String loginPerson;

	private String passwordPerson;

	public User() {
		super();
	}

	public boolean isStatusUser() {
		return statusUser;
	}

	public void setStatusUser(boolean statusUser) {
		this.statusUser = statusUser;
	}

	public String getObjectiveUser() {
		return objectiveUser;
	}

	public void setObjectiveUser(String objectiveUser) {
		this.objectiveUser = objectiveUser;
	}

	public int getHeightUser() {
		return heightUser;
	}

	public void setHeightUser(int heightUser) {
		this.heightUser = heightUser;
	}

	public Float getWeightUser() {
		return weightUser;
	}

	public void setWeightUser(Float weightUser) {
		this.weightUser = weightUser;
	}

	public Float getBmrUser() {
		return bmrUser;
	}

	public void setBmrUser(Float bmrUser) {
		this.bmrUser = bmrUser;
	}

	public String getRestrictionUser() {
		return restrictionUser;
	}

	public void setRestrictionUser(String restrictionUser) {
		this.restrictionUser = restrictionUser;
	}

	public String getCostUser() {
		return costUser;
	}

	public void setCostUser(String costUser) {
		this.costUser = costUser;
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
