package com.vektorel.foksiyon2;

import java.util.Scanner;

public class Yonlendirici {

	public static void main(String[] args) {
		System.out.println("main foksiyonu cali�ti");
		int veriAl = veriAl();
		yonlendirici(veriAl);
		System.out.println("main foksiyonu bitti");
	}

	public static void yonlendirici(int veri) {
		System.out.println("yonlendirici foksiyonu cali�ti");
		if(tekMI(veri)){
			System.out.println("tek");
		}else if(ciftMI(veri)){
			System.out.println("cift");
		}else{
			return;
		}
		
	}

	private static boolean ciftMI(int veri) {
		System.out.println("cift foksiyonu cali�ti");
		if(veri % 2 == 0){
			return true;
		}
		return false;
	}

	public static boolean tekMI(int veri) {
		System.out.println("tek foksiyonu cali�ti");
		if (veri % 2 == 1) {
			return true;
		}
		return false;
	}

	public static int veriAl() {
		System.out.println("veriAl foksiyonu cali�ti");
		Scanner scan = new Scanner(System.in);
		int sonuc = scan.nextInt();
		return sonuc;

	}

}
