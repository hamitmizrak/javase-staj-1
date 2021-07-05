package com.ecodation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ecodation.dao.AdminDao;
import com.ecodation.dto.AdminDto;
import com.ecodation.utils.IDaoImplements;

public class AdminController implements IDaoImplements<AdminDto> , Serializable {
	private static final long serialVersionUID = -6841720763526975890L;
	
	AdminDao adminDao;
	AdminDto adminDto;
	List<AdminDto> adminList;
	
	// parametresiz constructor
	// null pointer exception almamak için
	public AdminController() {
		adminDao = new AdminDao();
		adminDto = new AdminDto();
	}
	
	// kullanıcı adını bul ve göster
	
	@Override
	public void create(AdminDto t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(AdminDto t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArrayList<AdminDto> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// getter setter
	public AdminDao getAdminDao() {
		if (this.adminDao == null)
			this.adminDao = new AdminDao();
		return adminDao;
	}
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	public AdminDto getAdminDto() {
		if (this.adminDto == null)
			this.adminDto = new AdminDto();
		return adminDto;
	}
	
	public void setAdminDto(AdminDto adminDto) {
		this.adminDto = adminDto;
	}
	
	// Hata olursa buraya bakalım.
	public List<AdminDto> getAdminList() {
		return adminList;
	}
	
	public void setAdminList(List<AdminDto> adminList) {
		this.adminList = adminList;
	}
	
	// search işlemi
	@Override
	public List<AdminDto> searchInformation() {
		
		return this.adminDao.searchInformation();
	}
	
	public boolean loginSearch() {
		Scanner klavye = new Scanner(System.in);
		List<AdminDto> adminDto = searchInformation();
		
		String dbEmail = adminDto.getUserEmail() , dbPassword = adminDto.getUserPassword();
		String klavyeEmail , klavyePassword;
		// boolean isResut=false;
		
		System.out.println("Lüttfen email adresiniz giriniz");
		klavyeEmail = klavye.nextLine();
		
		System.out.println("Lütfen şifre  giriniz");
		klavyePassword = klavye.nextLine();
		
		if ((klavyeEmail.equalsIgnoreCase(dbEmail)) && (klavyePassword.equalsIgnoreCase(dbPassword))) {
			{
				System.out.println("admin panele yönlendiriliyorsunuz");
				return true;
				
			}
		} else {
			System.out.println("Şifre yanlış");
			return false;
		}
		
	}
	
}
