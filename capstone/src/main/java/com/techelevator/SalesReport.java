package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class SalesReport {

    private BigDecimal totalRevenue = new BigDecimal(0.00);
    private Map<String, Integer> boughtItems = new HashMap<>();


    public SalesReport()
    {
        this.boughtItems = boughtItems;
        this.totalRevenue = totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public Map<String, Integer> getBoughtItems() {
        return boughtItems;
    }
    File dataFile = new File("C:\\Users\\Student\\workspace\\capstone-1-team-4\\capstone\\vendingmachine.csv");

    public void getSales() {

        try {
            PrintWriter dataOutput = new PrintWriter(dataFile);
            for(String s : boughtItems.keySet()) {
                dataOutput.println(s + "|" + boughtItems.get(s));
            }
            dataOutput.println("");
            dataOutput.printf("**TOTAL SALES**  " + "%6.2f", getTotalRevenue());
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println("File not found.");
        }


    }
}
