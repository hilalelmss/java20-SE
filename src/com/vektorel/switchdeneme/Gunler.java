package com.vektorel.switchdeneme;

import java.util.Scanner;

public class Gunler {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		int veri = oku.nextInt();
		
		switch (veri) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
		case 3:
			System.out.println("�ar�amba");
		default:
			System.out.println("Ge�ersiz Veri");
		}
	}
}
