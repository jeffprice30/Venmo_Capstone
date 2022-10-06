package com.techelevator;

import java.util.Scanner;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public void run() {
		System.out.println("Welcome to the Vendo-Matic 800!");
		while (true) {
			System.out.println("Please make your selection.");
			System.out.println("(1) Display Vending Machine Items");
			System.out.println("(2) Purchase");
			System.out.println("(3) Exit");
			Scanner userInput = new Scanner(System.in);
			String input = userInput.nextLine();
			if (input != null) {
				switch (input) {
					case "1":
					case "2":
					case "3":

				}
			} else {
				System.out.println("I'm sorry, I did not understand that.");
			}
		}
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}


}


