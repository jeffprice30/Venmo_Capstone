package com.techelevator;
import java.math.BigDecimal;

public class CandyItem extends Item implements Munchable{


    public CandyItem(String slot, String name, BigDecimal cost, int amountRemaining) {
        super(slot, name, cost, amountRemaining);
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
