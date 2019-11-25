package com.mobileapp.dao;

import java.util.List;

import com.mobileapp.dto.Mobile;

public interface MobileDAO {
	
	public boolean saveMobile(Mobile mobile);
	
	public List<Mobile> mobileDetails();
	
	public Mobile search(String name);
	
	public int update(Mobile mb);
	
	public int delete(String name);
	
	
	

}
