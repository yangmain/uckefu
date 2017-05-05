package com.ukefu.util.extra;

import java.io.Serializable;
import java.util.List;

public interface DataExchangeInterface {
	
	
	public Serializable getDataByIdAndOrgi(String id, String orgi) ;
	
	public List<?> getListDataByIdAndOrgi(String id, String orgi) ;
	
}
