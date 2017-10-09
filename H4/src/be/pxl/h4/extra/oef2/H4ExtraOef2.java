package be.pxl.h4.extra.oef2;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4ExtraOef2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Voer uw eerste getal in.");
	int a = input.nextInt();
	System.out.println("Voer uw tweede getal in.");
	int b = input.nextInt();
	System.out.println("Voer uw derde getal in.");
	int c = input.nextInt();
	
	if (a + b < 20) {
		int uitvoer = a + b + c;
	System.out.println(uitvoer);
	} else { 
	System.out.println("te groot.");
	


	}
	input.close();
}
}
