package com.example.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity

public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int passengerid;
    @OneToOne(mappedBy="passenger", fetch = FetchType.LAZY)    
	private User user;
	@ManyToMany(mappedBy = "passenger", fetch = FetchType.LAZY)
	private List<Flightbooking> flightbooking;
   
	private String passengerName;
	private int age;
	private String gender;
	private String mealPreference;
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMealPreference() {
		return mealPreference;
	}
	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}
	@Override
	public String toString() {
		return "Passgener [passengerid=" + passengerid + ", passengerName=" + passengerName + ", age=" + age
				+ ", gender=" + gender + ", mealPreference=" + mealPreference + "]";
	}
	
	
	
	
	
}