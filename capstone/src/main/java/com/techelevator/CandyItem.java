package com.techelevator;
import java.math.BigDecimal;

public class CandyItem extends Item implements Munchable{


    public CandyItem(String name, BigDecimal cost, int amountRemaining) {
        super(name, cost, amountRemaining);
    }

    public CandyItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Munch Munch, Yum";
    }
}
