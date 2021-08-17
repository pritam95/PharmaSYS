package com.pharmasys.beans.abstrct;

import java.util.Date;

public interface IRole {
	
	public long getRoleId();
	
	public void setRoleId(long roleId);
	
	public String getRoleName();
	
	public void setRoleName(String roleName);
	
	public String getRoleValue();
	
	public void setRoleValue(String roleValue);
	
	public String getActive();
	
	public void setActive(String active);
	
	public Date getCreatedOn();

	public void setCreatedOn(Date createdOn);

	public Date getUpdatedOn();

	public void setUpdatedOn(Date updatedOn);

}
