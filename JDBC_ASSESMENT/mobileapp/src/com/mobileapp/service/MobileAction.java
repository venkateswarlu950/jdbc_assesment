package com.mobileapp.service;

import com.mobileapp.dao.MobileDAO;
import com.mobileapp.dao.MobileServiceImpl;

public class MobileAction {

	private MobileAction() {

	}

	public static MobileDAO getDetails() {

		return new MobileServiceImpl();
	}

}
