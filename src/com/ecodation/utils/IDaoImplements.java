package com.ecodation.utils;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoImplements<T> {
	void create(T t);
	void update(T t);
	void delete(long id);
	ArrayList<T> list();
	
	// database üzeriden veri çekip kontrol sağlamak için.
	ArrayList<T> searchInformation();
	
	default Connection dbConnection() {
		DatabaseUtil databaseUtil = new DatabaseUtil();
		return databaseUtil.databaseConnectionDb();
	}
}
