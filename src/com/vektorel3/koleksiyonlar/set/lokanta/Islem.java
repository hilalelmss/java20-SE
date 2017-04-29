package com.vektorel3.koleksiyonlar.set.lokanta;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Islem {

	public static void main(String[] args) {
	
		
		Lokanta[] lokataArray = lokantaGetir();
		
		Set<Lokanta> mySet = new HashSet<>();
		
		for (int i = 0; i < lokataArray.length; i++) {
			Lokanta veri = lokataArray[i];
			mySet.add(veri);
		}
		
		for (Lokanta lokanta : mySet) {
			System.out.println(lokanta.getIsim());
		}
		
		System.out.println("iterator");
		Iterator<Lokanta> ite =   mySet.iterator();
		while (ite.hasNext()) {
			Lokanta lokanta = ite.next();
			System.out.println(lokanta.getIsim());
		}

		
	}

	private static Lokanta[] lokantaGetir() {
//		Lokanta[] lokataArray = new Lokanta[5];
		
		Lokanta lokanta1 = new Lokanta("ada d�ner", "mamak");
		Lokanta lokanta2 = new Lokanta("ata �a� kabap", "ulus");
		Lokanta lokanta3 = new Lokanta("�zler d�ner", "kecioren");
		Lokanta lokanta4 = new Lokanta("Abdullah k�fteci", "�ankaya");
		Lokanta lokanta5 = new Lokanta("Tarihi Mutfak", "�ankaya");

		Lokanta[] lokataArray = {lokanta1,lokanta2,lokanta3,
				lokanta4,lokanta5};
		
//		lokataArray[0] = lokanta1;
//		lokataArray[1] = lokanta2;
//		lokataArray[2] = lokanta3;
//		lokataArray[3] = lokanta4;
//		lokataArray[4] = lokanta5;		
		
		return lokataArray;
	}
}
