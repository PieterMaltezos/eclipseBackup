package be.pxl.h5.oef1;
		//author: Pieter Maltezos
import java.util.Scanner;

public class H5Oef1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geef uw bedrag in BEF in.");
		double bedragBEF = input.nextDouble();

		final double WISSELKOERS = 40.3399;
		double bedragEuro = bedragBEF / WISSELKOERS;
		System.out.println("Uw bedrag in euro is: " + bedragEuro);

		input.close();
	}

}
