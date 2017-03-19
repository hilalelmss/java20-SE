package com.vektore2.araba;

public class Insan {
	
	public static void main(String[] args) {
		
		Araba omer = new Araba();
		
		Araba bmwKirmizi = new Araba("bmw","k�rm�z�");

		Araba suat  = new Araba("merdeces","k�rm�z�",2012);
		
		Araba usta  = new Araba("merdeces","k�rm�z�",2012,1000.0);

		System.out.println(usta.getMotorGucu());
		
		usta.musteriTemsilcisineSor(2000);
		
		System.out.println(usta.getMotorGucu());

		
		
		System.out.println(omer.getMarka());
		System.out.println(bmwKirmizi.getMarka());
		System.out.println(suat.getMarka());

		
		
	}

}
