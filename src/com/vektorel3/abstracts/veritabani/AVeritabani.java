package com.vektorel3.abstracts.veritabani;

public abstract class AVeritabani {
	
	public void connection(){
		System.out.println("baglandi");
	}
	
	public void connectionClose(){
		System.out.println("bagl�anti kesildi");
	}
	
	
	public abstract void  login();

}
