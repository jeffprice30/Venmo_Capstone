package com.techelevator;
import java.math.BigDecimal;

public class ChipItem extends Item implements Munchable{

    private int startingAmount = 5;


    public ChipItem(String slot, String name, BigDecimal cost, String itemType) {
        super(slot, name, cost, itemType);
        this.amountRemaining = startingAmount;
        this.itemType = "Chip";

    }

    public ChipItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Crunch Crunch, Yum!";
    }
}
