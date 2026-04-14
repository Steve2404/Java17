package com.string;

public class Invoice {
    public static void main(String[] args) {
        String [] items = {"Banana", "Chocolate-Bar", "Milk"};
        int[] qty = {3, 12, 1};
        double [] unit = {0.59, 1.25, 1.09};

        String rowFormat = "|%-15s |%5s |%10s |%10s|%n";
        String dataFormat = "|%-15s |%5d |%10.2f |%10.2f|%n";

        double total = 0.0;

        printBorder();
        System.out.printf(rowFormat, "ITEM", "QTY", "UNIT", "TOTAL");
        printBorder();

        for (int i = 0; i < items.length; i++) {
            double cost = qty[i] * unit[i];
            total += cost;


             System.out.printf(dataFormat, items[i], qty[i], unit[i], cost);

        }

        System.out.printf(rowFormat, " ", " ", " ", " ");
        printBorder();
        System.out.printf("|%-15s |%5s %10s %12.2f|%n", "Total", " ", " ", total);
        printBorder();
    }

    public static void printBorder() {
        System.out.printf("*%-15s *%5s *%10s *%10s*%n",
                "-".repeat(15), "-".repeat(5), "-".repeat(10), "-".repeat(10));
    }
}
