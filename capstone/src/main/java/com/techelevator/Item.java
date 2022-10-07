package com.techelevator;

import java.math.BigDecimal;

public abstract class Item implements Munchable {

    protected String name;
    protected final BigDecimal cost;
    protected int amountRemaining;
    protected String slot;
    protected String itemType;


    public Item(String slot, String name, BigDecimal cost, String itemType) {
        this.name = name;
        this.cost = cost;
        this.amountRemaining = amountRemaining;
        this.slot = slot;
    }

    public Item()
    {
        this.name = "?";
        this.cost = BigDecimal.valueOf(0.99);
        this.amountRemaining = 1;
        this.slot = "?";
        this.itemType = "?";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getItemType() {
        return itemType;
    }
    public abstract String getSound();
}
