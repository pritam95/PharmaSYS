package com.pharmasys.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.pharmasys.beans.abstrct.IUser;


@Component
@Entity
@Table(name= "main_users")   
public class User implements IUser{

	@Id
	private long id;
	
	private String first_name;
	
	private String last_name;
	
	private String gender;
	
	private Date dob;
	
	private String address;
	
	private String state;
	
	private String pin_no;
	
	private String phone_no;
	
	private String emergency_no;
	
	private String email;
	
	private String password;
	
	private String active_status;
	
	private String user_access;
	
	private Date created_on;
	
	private Date updated_on;
	
	private Date last_login;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String firstName) {
		this.first_name = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String lastName) {
		this.last_name = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_no() {
		return pin_no;
	}

	public void setPin_no(String pin_no) {
		this.pin_no = pin_no;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmergency_no() {
		return emergency_no;
	}

	public void setEmergency_no(String emergency_no) {
		this.emergency_no = emergency_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

	public String getUser_access() {
		return user_access;
	}

	public void setUser_access(String user_access) {
		this.user_access = user_access;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

}
