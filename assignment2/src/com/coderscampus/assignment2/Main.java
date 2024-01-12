package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int numGuesses = 0;
		System.out.println(randomNumber);
		System.out.println("Pick a number between 1 and 100:");
		Scanner scanner = new Scanner(System.in);
		boolean Winner = false;

		while (numGuesses < 5) {

			int userGuess = scanner.nextInt();

			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Pick a number between 1 and 100");
			} else if (userGuess < randomNumber) {
				System.out.println("Pick a higher number");
				numGuesses++;
			} else if (userGuess > randomNumber) {

				System.out.println("Pick a lower number");
				numGuesses++;
			} else {
				Winner = true;
				break;
			}
		}
		if(Winner) {
			System.out.println("you win");
		} else {
			System.out.println("You lose. The correct number was:"+ randomNumber);
		}

	}
	
}
