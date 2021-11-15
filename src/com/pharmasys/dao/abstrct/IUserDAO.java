package com.pharmasys.dao.abstrct;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.util.to.TransferObject;

public interface IUserDAO {
	
	public void createUser(IUser u);
	
	public TransferObject<IUser> getUser(TransferObject<IUser> u);

}
