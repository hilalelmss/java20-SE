package com.vektorel.switchdeneme;

import java.util.Scanner;

public class KodBarkod {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		String barkod = oku.nextLine();
		int yil = oku.nextInt();
		
		switch (barkod.toLowerCase()+"-"+yil) {
		case "java20-2017":
			System.out.println("A��k Kur");
			break;
		case "java19-2016":
			System.out.println("Kapal� Kur");
			break;
		case "java21-2018":
			System.out.println("A��lacak Kur");
			break;
		default:
			System.out.println("ge�ersiz veri");
			break;
		}
	}

}
