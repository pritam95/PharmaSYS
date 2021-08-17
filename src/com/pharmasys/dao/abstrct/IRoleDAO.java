package com.pharmasys.dao.abstrct;

import java.util.List;

import com.pharmasys.beans.abstrct.IRole;
import com.pharmasys.util.to.TransferObject;

public interface IRoleDAO {
	
	public TransferObject<List<IRole>> getAllRoles();

}
