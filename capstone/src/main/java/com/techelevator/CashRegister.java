package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class CashRegister {

    private BigDecimal balance;

    public CashRegister() {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void moneyFeed() {

        while (true) {
            System.out.println("Please enter the amount you would like to add in whole dollars only ");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            int moneyAdded = Integer.parseInt(userInput);
            BigDecimal newMoney = new BigDecimal(moneyAdded);
            balance.add(newMoney);
        }
    }
}
