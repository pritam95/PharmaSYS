package com.pharmasys.util.to;

import java.util.HashMap;
import java.util.Map;

public class TransferObject<T> {
	
	private T obj;
	
	private Map<String,String> context= new HashMap<String,String>();

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Map<String, String> getContext() {
		return context;
	}

	public void setContext(Map<String, String> context) {
		this.context = context;
	}
	

}
