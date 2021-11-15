package com.pharmasys.service.abstrct;

import com.pharmasys.beans.abstrct.IUser;
import com.pharmasys.util.to.TransferObject;

public interface IUserService {
	
	public void register(IUser u);
	
	public TransferObject<IUser> doLogin(TransferObject<IUser> u);
	
}
