package com.techelevator;
import java.math.BigDecimal;

public class GumItem extends Item implements Munchable{

    private int startingAmount = 5;


    public GumItem(String slot, String name, BigDecimal cost, String itemType) {
        super(slot, name, cost, itemType);
        this.amountRemaining = startingAmount;
        this.itemType = "Gum";
    }

    public GumItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Chew Chew, Yum!";
    }
}
