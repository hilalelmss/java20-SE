package com.vektorel.vergilendirme;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kar Giriniz");
		
		int kar = scan.nextInt();
		
		int vergi = 0;
		
		
		
		if(kar > 1000){
			System.out.println("Y�ksek Vergi");
			System.out.print("Vergi Dilimi Giriniz:");
			int vergiDilimi = scan.nextInt();
			vergi = kar/vergiDilimi;
			System.out.println("verginiz:"+ vergi + " vergi dilimi:"+vergiDilimi);
		}else if(kar > 500){
			System.out.println("Orta Vergi");
			System.out.print("Vergi Dilimi Giriniz:");
			int vergiDilimi = scan.nextInt();
			vergi = kar/vergiDilimi;
			System.out.println("verginiz:"+ vergi + " vergi dilimi:"+vergiDilimi);
		}else if(kar > 0){
			System.out.println("d���k Vergi");
			System.out.print("Vergi Dilimi Giriniz:");
			int vergiDilimi = scan.nextInt();
			vergi = kar/vergiDilimi;
			System.out.println("verginiz:"+ vergi + " vergi dilimi:"+vergiDilimi);
		}else{
			System.out.println("hatal� veri girdiniz");
		}
		

	}

}
