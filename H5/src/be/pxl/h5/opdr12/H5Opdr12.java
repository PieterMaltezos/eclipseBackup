package be.pxl.h5.opdr12;

import java.util.Scanner;

public class H5Opdr12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Voer de waarde van x in.");
		int x = input.nextInt();
	
		switch (x) { 
		case 1:
			System.out.println("Het getal is 1");
			break;
		case 2:
		case 3:
			System.out.println("Het getal is 2 of 3");
			break;
			default:
			System.out.println("Het getal is niet 1, 2 of 3");
		}
		input.close();
	}

}
