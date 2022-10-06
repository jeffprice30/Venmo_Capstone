package com.techelevator;
import java.math.BigDecimal;

public class DrinkItem extends Item implements Munchable{


    public DrinkItem(String name, BigDecimal cost, int amountRemaining) {
        super(name, cost, amountRemaining);
    }

    public DrinkItem() {
        super();
    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum";
    }
}
