package com.ecodation.dto;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen adınız soyadınızı giriniz");
		String adSoyad = klavye.nextLine();
		System.out.println(adSoyad);
	}
}
