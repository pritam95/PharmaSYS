package com.pharmasys.beans.abstrct;

import java.util.Date;

public interface IUser {
	
	public static String REQUEST_PARAM_f_name = "f_name";
	
	public static String REQUEST_PARAM_l_name = "l_name";

	public static String REQUEST_PARAM_gender = "gender";
	
	public static String REQUEST_PARAM_dob = "dob";
	
	public static String REQUEST_PARAM_address = "address";
	
	public static String REQUEST_PARAM_state = "state";
	
	public static String REQUEST_PARAM_pinNo = "pinNo";
	
	public static String REQUEST_PARAM_phoneNo = "phoneNo";
	
	public static String REQUEST_PARAM_emerPhoneNo = "emerPhoneNo";

	public static String REQUEST_PARAM_email = "email";
	
	public static String REQUEST_PARAM_userAcces = "userAcces";

	public static String REQUEST_PARAM_password = "password";
	
	public long getId();
	
	public void setId(long id);
	
	public String getFirst_name();
	
	public void setFirst_name(String firstName);
	
	public String getLast_name();
	
	public void setLast_name(String lastName);
	
	public String getGender();
	
	public void setGender(String gender);
	
	public Date getDob();
	
	public void setDob(Date dob);
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public String getState();
	
	public void setState(String state);
	
	public String getPin_no();
	
	public void setPin_no(String pin_no);
	
	public String getPhone_no();
	
	public void setPhone_no(String phone_no);
	
	public String getEmergency_no();
	
	public void setEmergency_no(String emergency_no);
	
	public String getEmail();
	
	public void setEmail(String email);
	
	public String getPassword();
	
	public void setPassword(String password);
	
	public String getActive_status();
	
	public void setActive_status(String active_status);
	
	public String getUser_access();
	
	public void setUser_access(String user_access);
	
	public Date getCreated_on();
	
	public void setCreated_on(Date created_on);
	
	public Date getUpdated_on();
	
	public void setUpdated_on(Date updated_on);
	
	public Date getLast_login();
	
	public void setLast_login(Date last_login);
	
}
