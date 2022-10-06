package com.techelevator;
import java.math.BigDecimal;

public class GumItem extends Item implements Munchable{


    public GumItem(String name, BigDecimal cost, int amountRemaining) {
        super(name, cost, amountRemaining);
    }

    public GumItem() {
        super();
    }

    @Override
    public String getSound()
    {
        return "Chew Chew, Yum";
    }
}
