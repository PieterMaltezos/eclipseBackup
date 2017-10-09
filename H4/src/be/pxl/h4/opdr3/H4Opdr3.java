package be.pxl.h4.opdr3;
		//author: Pieter Maltezos
import java.util.Scanner;

public class H4Opdr3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Voer uw leeftijd in:");
		int leeftijd = input.nextInt();
		
		if (leeftijd >= 18) {
			System.out.println("U bent volwassen.");
		} else { 
			System.out.println("Jij bent een kind.");
		}
		input.close();
	}
		
}
