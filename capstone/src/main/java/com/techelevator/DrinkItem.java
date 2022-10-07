package com.techelevator;
import java.math.BigDecimal;

public class DrinkItem extends Item implements Munchable{

    private int startingAmount = 5;


    public DrinkItem(String slot, String name, BigDecimal cost, String itemType) {
        super(slot, name, cost, itemType);
        this.amountRemaining = startingAmount;

        this.itemType = "Drink";
    }

    public DrinkItem() {
        super();
    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }
}
