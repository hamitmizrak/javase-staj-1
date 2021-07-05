package com.ecodation.mainx;

import com.ecodation.controller.AdminController;
import com.ecodation.utils.DatabaseUtil;

public class MainTest {
	public static void main(String[] args) {
		DatabaseUtil databaseUtil = new DatabaseUtil();
		databaseUtil.databaseConnectionDb();
		
		AdminController adminController = new AdminController();
		// String result = adminController.loginSearch() ? "şifre doğru" : "şifre
		// System.out.println(result);
		
		if (adminController.loginSearch()) {
			System.out.println("Listeleme");
		} else {
			// System.out.println("Yanlış");
		}
		
	}
	
}
