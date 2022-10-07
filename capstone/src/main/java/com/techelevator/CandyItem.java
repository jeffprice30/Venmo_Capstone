package com.techelevator;
import java.math.BigDecimal;

public class CandyItem extends Item implements Munchable{

    private int startingAmount = 5;

    public CandyItem(String slot, String name, BigDecimal cost, String itemType) {
        super(slot, name, cost, itemType);
        this.amountRemaining = startingAmount;
        this.itemType = "Candy";
    }

    public CandyItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Munch Munch, Yum!";
    }
}
