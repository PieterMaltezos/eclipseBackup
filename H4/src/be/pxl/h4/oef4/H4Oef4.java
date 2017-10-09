package be.pxl.h4.oef4;

import java.util.Scanner;

//author: Pieter Maltezos
public class H4Oef4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kostenOuderdom = 0;
		int kostenRating = 0;
		int basisPrijs = 5;

		System.out.println("Hoeveel jaar oud is de film?");
		int ouderdomFilm = input.nextInt();
		System.out.println("Welke rating heeft de film? (1-5 sterren)");
		int ratingFilm = input.nextInt();


			int teBetalen = basisPrijs + kostenOuderdom + kostenRating;
			if (teBetalen > 7) {
				teBetalen = 7;
			}
			System.out.println("De film kost " + "€" + teBetalen);
		input.close();
	}
	}

