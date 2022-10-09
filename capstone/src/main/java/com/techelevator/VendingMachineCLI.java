package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineCLI {

	private List<Item> itemList = new ArrayList<>();
	final String filePath = "C:\\Users\\Student\\workspace\\capstone-1-team-4\\capstone\\vendingmachine.csv";

	public VendingMachineCLI() {
	}

	public void run() {
	//	int menuNumber = 0;
		BigDecimal balance = new BigDecimal("0.00");
		System.out.println("Welcome to the Vendo-Matic 800!");
		this.getInventory();
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
						//this.getInventory();
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
						break;
					}
					case "2": //The Purchase Menu
					{
							while (true) {

							System.out.println("Current Money Provided: $" + balance);
							System.out.println("");
							System.out.println("(1) Feed Money");
							System.out.println("(2) Select Product");
							System.out.println("(3) Finish Transaction");

							String purchaseMenuInput = userInput.nextLine();
							//Purchase Menu input begins here
							switch (purchaseMenuInput)
							{
								case "1": // Purchase Menu (Feed Money)
								{
									while (true) {
										System.out.println("Please enter the amount you would like to add in whole dollars only. Enter 'X' to go back.");
										String moneyFeederInput = userInput.nextLine();
										if(moneyFeederInput.equalsIgnoreCase("X")){break;}
										try {
											int moneyAdded = Integer.parseInt(moneyFeederInput);
											BigDecimal newMoney = new BigDecimal(moneyAdded);
											balance = balance.add(newMoney);
											System.out.println("Your current balance is: $" + balance);
										} catch (Exception e) {
											System.out.println("Please enter a WHOLE dollar amount, please.");
										}

									}
									break;
								}
								case "2": // Purchase Menu (Select Product)
								{
									//this.getInventory();
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
									System.out.println("Enter slot number of the item you would like ");
									String itemSelect = userInput.nextLine();
									for (Item x : itemList) {

										if(x.getSlot().equalsIgnoreCase(itemSelect) && x.getAmountRemaining() <= 0)
										{
											System.out.println("Sorry, this item is Sold Out.");
										}
										else if(x.getSlot().equalsIgnoreCase(itemSelect) && balance.compareTo(x.getCost()) < 0)
										{
											System.out.println("You do not have enough money to purchase this product.");
										}
										else if (x.getSlot().equalsIgnoreCase(itemSelect) && balance.compareTo(x.getCost()) >= 0) {
											balance = balance.subtract(x.getCost());
											x.amountRemaining -= 1;
											//add x.getCost to the sales report revenue
											System.out.println("Item " + x.name + " Cost " + x.getCost() + " Money Remaining " + balance);
											System.out.println(x.getSound());

										}

									}
									break;
								}
								case "3": // Purchase Menu (Finish Transaction)
								{
									
									break;
								}
							}
						}
					}
					case "3":
					{
						break;
					}

					default:
					{
						System.out.println("I'm sorry, I did not understand that.");
					}
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

