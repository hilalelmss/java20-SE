package com.vektorel3.abstracts.veritabani;

public class Islem {
	
	public static void main(String[] args) {
		
		AVeritabani veritabani = new AVeritabani() {
			
			@Override
			public void login() {
				System.out.println("login class i�i");
				
			}
			
			@Override
			public void connection() {
				System.out.println("class i�i baglanti");
				super.connection();
			}
		};
		
		veritabani.login();
		
		veritabani.connection();
		
		
	}

}
