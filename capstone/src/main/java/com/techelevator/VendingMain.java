package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMain {

    private List<Item> itemList = new ArrayList<>();
    private BigDecimal balance;
    final String filePath = "C:\\Users\\Student\\workspace\\capstone-1-team-4\\capstone\\vendingmachine.csv";



    public void getInventory()
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
                switch(outputFormatted[3])
                {
                    case "Gum":
                        GumItem gum = new GumItem(slot, name, itemCost, 5);
                        itemList.add(gum);
                        break;
                    case "Candy":
                        CandyItem candy = new CandyItem(slot, name, itemCost, 5);
                        itemList.add(candy);
                        break;
                    case "Chip":
                        ChipItem chip = new ChipItem(slot, name, itemCost, 5);
                        itemList.add(chip);
                        break;
                    case "Drink":
                        DrinkItem drink = new DrinkItem(slot, name, itemCost, 5);
                        itemList.add(drink);
                        break;
                }
        }} catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
    }

}
//outputFormatted[0] = slot
//outputFormatted[1] = name
//outputFormatted[2] = cost
//outputFormatted[3] = ItemType

//Item c = new Item(outputFormatted[0], outputFormatted[1], outputFormatted[2], outputFormatted[3]);
//itemList.add(c);

//