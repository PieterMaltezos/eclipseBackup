package be.pxl.h4.oef2;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4Oef2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Geef uw eerste getal in.");
		int getal1 = input.nextInt();
		
		System.out.println("Geef uw tweede getal in");
		int getal2 = input.nextInt();
		int vermenigvuldiger = 5;
		int kleinsteGetal = 0;
		int grootsteGetal = 0;
		
		if (getal1 < getal2) {
			kleinsteGetal = getal1;
			grootsteGetal = getal2;
		
		} else { 
			kleinsteGetal = getal2;
			grootsteGetal = getal1;
		}
		int uitkomst = grootsteGetal - kleinsteGetal;
		System.out.println(grootsteGetal + " - " + kleinsteGetal + " = " + uitkomst);
		System.out.println(uitkomst + " X " + vermenigvuldiger + " = " + (uitkomst * vermenigvuldiger) );
		input.close();
	}

}
