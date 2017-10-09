package be.pxl.h4.oef1;
		//author: Pieter Maltezos
import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aantal volwassenen?");
		int volwassenen = input.nextInt();
		System.out.println("Aantal kinderen?");
		int kinderen = input.nextInt();
		
		int prijsKind = 15;
		int prijsVol = 28;

		int totalePrijsKind = prijsKind*kinderen;
		int totalePrijsVol = prijsVol*volwassenen;
		int sum = totalePrijsKind + totalePrijsVol;
		
		System.out.println("U moet €" + sum + " betalen.");
		
		
		
		input.close();
		
		
		
		
		
	}

}
