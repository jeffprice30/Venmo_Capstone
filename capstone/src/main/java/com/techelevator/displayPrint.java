package com.techelevator;

import java.math.BigDecimal;
import java.util.List;

public class displayPrint {

    public void displayInventory(List<Item> itemList) {

        for(Item x : itemList) {
            if(x.getAmountRemaining() > 0) {
                System.out.println(x.getSlot() + "|" + x.getItemType() + "|" + x.getCost() + "|" + x.getName() + ": " + x.getAmountRemaining() + " More Left");
            } else {
                System.out.println(x.getSlot() + "|" + x.getItemType() + "|" + x.getCost() + "|" + x.getName() + ": " + "SOLD OUT");
            }
        }
        System.out.println(" ");
    }
    public void displayPurchaseMenu(BigDecimal balance) {
        System.out.println("Current Money Provided: $" + balance);
        System.out.println("");
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction and Return to Main Menu");
//        System.out.println("Enter 'X' to return to the main menu.");
    }

    public void displayMainMenu () {
        System.out.println("Please make your selection.");
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
    }

}


