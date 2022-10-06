package com.techelevator;
import java.math.BigDecimal;

public class ChipItem extends Item implements Munchable{


    public ChipItem(String slot, String name, BigDecimal cost, int amountRemaining) {
        super(slot, name, cost, amountRemaining);
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
