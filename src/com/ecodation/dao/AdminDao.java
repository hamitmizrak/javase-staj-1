package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ecodation.dto.AdminDto;
import com.ecodation.utils.IDaoImplements;

public class AdminDao implements IDaoImplements<AdminDto> {
	ResultSet resultSet;
	private AdminDto adminDto;

	@Override
	public void create(AdminDto t) {
		System.out.println("create yapılıyor");

	}

	@Override
	public void update(AdminDto t) {
		System.out.println("update yapılıyor");

	}

	@Override
	public void delete(long id) {
		System.out.println("delete yapılıyor");

	}

	@Override
	public ArrayList<AdminDto> list() {
		System.out.println("list yapılıyor");
		return null;
	}

	// c p r
	@Override
	public ArrayList<AdminDto> searchInformation() {
		AdminDto adminDto = new AdminDto();
		String sql = "select * from admin2 where user_email=? and user_password=?";
		try (Connection connection = dbConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminDto.getUserEmail());
			preparedStatement.setString(2, adminDto.getUserPassword());
			this.resultSet = preparedStatement.executeQuery();
			System.out.println("Search listelendi.");
			if (resultSet.next()) {
				adminDto = new AdminDto();
				adminDto.setUserEmail(resultSet.getString("user_email"));
				adminDto.setUserPassword(resultSet.getString("user_password"));
				return ArrayList<AdminDto>;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (ArrayList<AdminDto>) adminDto;
	}

}
