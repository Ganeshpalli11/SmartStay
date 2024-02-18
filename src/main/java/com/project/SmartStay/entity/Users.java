package com.project.SmartStay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String email;
	int Otp;
	String name;
	String sur_name;
	String gender;
	long adhar;
	String address;

}
