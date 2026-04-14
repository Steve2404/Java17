package com.chap4;

import java.util.Arrays;

public class Ticket {
    public static void main(String[] args) {

    }

    public static String builTicketAndSearch(String name, String[] productAndPrice) {
        //productAndPrice : {"sandwich:5", "cafe:2", "aimant:4"}
        int i = 0;
        String[] product = new String[productAndPrice.length];
        int[] price = new int[productAndPrice.length];
        Arrays.sort(productAndPrice);

        for(String p : productAndPrice) {
            price[i] = Integer.parseInt(p.substring(p.indexOf(":") + 1));
            product[i] = p.substring(0, p.indexOf(":"));
            i++;
        }

        System.out.printf("%");

        return null;
    }
}
