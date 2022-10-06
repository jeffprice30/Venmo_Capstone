package com.techelevator;
import java.math.BigDecimal;

public class DrinkItem extends Item implements Munchable{


    public DrinkItem(String slot, String name, BigDecimal cost, int amountRemaining) {
        super(slot, name, cost, amountRemaining);
        this.itemType = "Drink";
    }

    public DrinkItem() {
        super();
    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }
}
