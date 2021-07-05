package com.ecodation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/hastane_otomasyonu";
	private String user = "root";
	private String password = "root";
	
	// database bağlanmak
	public Connection databaseConnectionDb() {
		try {
			if (this.connection == null || this.connection.isClosed()) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver başarılı bir şekilde yüklendi");
					connection = DriverManager.getConnection(url, user, password);
					System.out.println("Bağlantı başarılı bir şekilde gerçekleştirildi.");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
