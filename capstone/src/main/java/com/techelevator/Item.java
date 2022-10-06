package com.techelevator;

import java.math.BigDecimal;

public abstract class Item {

    protected String name;
    protected final BigDecimal cost;
    protected int amountRemaining;

    public Item(String name, BigDecimal cost, int amountRemaining) {
        this.name = name;
        this.cost = cost;
        this.amountRemaining = amountRemaining;
    }

    public Item()
    {
        this.name = "?";
        this.cost = BigDecimal.valueOf(0.99);
        this.amountRemaining = 1;
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
}
