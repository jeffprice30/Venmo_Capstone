package com.techelevator;
import java.math.BigDecimal;

public class GumItem extends Item implements Munchable{


    public GumItem(String slot, String name, BigDecimal cost, int amountRemaining) {
        super(slot, name, cost, amountRemaining);
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
