package com.string;

public class Invoice {
    public static void main(String[] args) {
        String [] items = {"Banana", "Chocolate-Bar", "Milk"};
        int[] qty = {3, 12, 1};
        double [] unit = {0.59, 1.25, 1.09};

        System.out.printf("*%-15s *%5s *%10s *%10s*%n", "-".repeat(15), "-".repeat(5), "-".repeat(10), "-".repeat(10));
        System.out.printf("|%-15s |%5s |%10s |%10s|%n", "ITEM", "QTY", "UNIT", "TOTAL");

        System.out.printf("*%-15s *%5s *%10s *%10s*%n", "-".repeat(15), "-".repeat(5), "-".repeat(10), "-".repeat(10));

        double total = 0.0;
        double cost = 0.0;
        for (int i = 0; i < items.length; i++) {
            cost = qty[i] * unit[i];
            total += cost;


             System.out.printf("|%-15s |%5d |%10.2f |%10.2f|%n", "ITEM", qty[i], unit[i], cost);

        }

        System.out.printf("|%-15s |%5s |%10s |%10s|%n", " ", " ", " ", " ");
        System.out.printf("*%-15s *%5s *%10s *%10s*%n", "-".repeat(15), "-".repeat(5), "-".repeat(10), "-".repeat(10));
        System.out.printf("|%-15s |%5s %10s %12.2f|%n", "Total", " ", " ", total);
        System.out.printf("*%-15s *%5s *%10s *%10s*%n", "-".repeat(15), "-".repeat(5), "-".repeat(10), "-".repeat(10));
    }
}
