package com.vektore2.cevre;

public class Ev {
	
	int kacOda = 1;
	double metreKAre;
	boolean bahceVarM�;
	String adres;
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void setBahceVarM�(boolean bahceVarM�) {
		this.bahceVarM� = bahceVarM�;
	}
	
	public boolean getBahceVarM�(){
		return this.bahceVarM�;
	}

	public int getKacOda() {
		return kacOda;
	}

	public void setKacOda(int kacOda) {
		this.kacOda = kacOda;
	}

	public double getMetreKAre() {
		return metreKAre;
	}

	public void setMetreKAre(double metreKAre) {
		this.metreKAre = metreKAre;
	}

	public String getAdres() {
		return adres;
	}

}
