package com.pharmasys.service.abstrct;

import java.util.List;

import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.util.to.TransferObject;

public interface IRoleService {
	
	public TransferObject<List<IRole>> getAllRoles();

}
