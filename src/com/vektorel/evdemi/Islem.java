package com.vektorel.evdemi;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		boolean kontrol;
		
		String kontrolString;
		
		Scanner oku = new Scanner(System.in);
		
		kontrol = oku.nextBoolean();
		
		kontrolString = oku.nextLine();
		
		if(kontrol){
			System.out.println("G�nayd�n");
		}else{
			System.out.println("Evden direk ��k");
		}
		
		
		String annenEvdeMiString;
		
		annenEvdeMiString = oku.nextLine();
		
		if(annenEvdeMiString.equals("evet")){
			System.out.println("String Evet Geldi");
		}else{
			System.out.println("String Ba�ka Bir de�er Geldi");
		}
		
		int paraCokomelEgrisi;
		
		paraCokomelEgrisi = oku.nextInt();
		
		if(paraCokomelEgrisi == 20){
			System.out.println("�ikolata senindir");
		}else if (paraCokomelEgrisi < 20 & paraCokomelEgrisi > 0){
			System.out.println("paran yetersiz");
		}else if (paraCokomelEgrisi>20){
			System.out.println("paran �ok");
		}else if (paraCokomelEgrisi == -1){
			System.out.println("paran bozuk degil yada yeterli degil");
		}
		
		
	}
	

}
