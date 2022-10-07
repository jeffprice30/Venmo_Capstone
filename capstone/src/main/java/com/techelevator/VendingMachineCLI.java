package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineCLI {

	private List<Item> itemList = new ArrayList<>();
	final String filePath = "C:\\Users\\Student\\workspace\\capstone-1-team-4\\capstone\\vendingmachine.csv";

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
					{
						this.getInventory();
						for(Item x : itemList)
						{
							if(x.getAmountRemaining() > 0)
							{
								System.out.println(x.getSlot() + "|" + x.getItemType() + "|" + x.getCost() + "|" + x.getName() + ": " + x.getAmountRemaining() + " More Left");
							}
							else
							{
								System.out.println(x.getSlot() + "|" + x.getItemType() + "|" + x.getCost() + "|" + x.getName() + ": " + "SOLD OUT");
							}
						}
					}
					case "2":
					case "3":

				}
			} else {
				System.out.println("I'm sorry, I did not understand that.");
			}
		}
	}


	public List<Item> getInventory()
	{
		//create a file object for the datafile
		File inventoryFile = new File(filePath);
		Scanner fileReader;



		//opens the file
		try {
			fileReader = new Scanner(inventoryFile);
			//creates a read loop until the end of the file contents have been reached
			while (fileReader.hasNextLine()) {
				String dataFileOutput = fileReader.nextLine();
				//and then store those values in a String array.
				String[] outputFormatted = dataFileOutput.split("\\|");

				//Now that we have accumulated all the data from the line, parse the data into the following:
				//First index (0) is the Vending Machine Slot
				String slot = outputFormatted[0];
				//Second index (1) is the Item Name
				String name = outputFormatted[1];
				//Third index (2) is the Item Cost
				BigDecimal itemCost = new BigDecimal(outputFormatted[2]);
				//Fourth index (3) is the Item Type, which will determine how it is constructed.
				String itemType = outputFormatted[3];
				switch(outputFormatted[3])
				{
					case "Gum":
						GumItem gum = new GumItem(slot, name, itemCost, itemType);
						itemList.add(gum);
						break;
					case "Candy":
						CandyItem candy = new CandyItem(slot, name, itemCost, itemType);
						itemList.add(candy);
						break;
					case "Chip":
						ChipItem chip = new ChipItem(slot, name, itemCost, itemType);
						itemList.add(chip);
						break;
					case "Drink":
						DrinkItem drink = new DrinkItem(slot, name, itemCost, itemType);
						itemList.add(drink);
						break;
				}
			}} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
			return itemList;

	}



	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}



}


