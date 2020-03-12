package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="userpassenger")
public class Userpassenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userPassengerId;
	private int userId;
	private int passengerId;
	public int getUserPassengerId() {
		return userPassengerId;
	}
	public void setUserPassengerId(int userPassengerId) {
		this.userPassengerId = userPassengerId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	@Override
	public String toString() {
		return "Userpassenger [userPassengerId=" + userPassengerId + ", userId=" + userId + ", passengerId="
				+ passengerId + "]";
	}
	

}
