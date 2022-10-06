package com.techelevator;
import java.math.BigDecimal;

public class ChipItem extends Item implements Munchable{


    public ChipItem(String name, BigDecimal cost, int amountRemaining) {
        super(name, cost, amountRemaining);
    }

    public ChipItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Crunch Crunch, Yum";
    }
}
