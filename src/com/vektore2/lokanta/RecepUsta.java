package com.vektore2.lokanta;

public class RecepUsta {
	private int id;
	public int masaSayi;
	public int garsonSayisi;
	int etMiktari;
	
	
	public void etMiktar�Sorgula(){
		NustrEt nustrEt = new NustrEt();
		System.out.println(nustrEt.etMiktari);
	}


}
