package com.vektore2.lokanta;

public class NustrEt {
	private int id;
	public int masaSayi;
	public int garsonSayisi;
	int etMiktari;
	
	public void etMiktarıSorgula(){
		RecepUsta recep = new RecepUsta();
		System.out.println(recep.etMiktari);
	}


}
