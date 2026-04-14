package com.string;

public class MiniFormatter {
    public static String format(String text, int width, char fill, char align) {
        if(text == null) text = "null";
        if(text.length() >= width) return text;
        int missing = width - text.length();
        switch (align) {
            case 'L':
                return text + String.valueOf(fill).repeat(missing);
            case 'R':
                return String.valueOf(fill).repeat(missing) + text;
            case 'C':
                int left = missing / 2;
                int right = missing -left;
                return String.valueOf(fill).repeat(left) + text + String.valueOf(fill).repeat(right);
            default:
                throw new IllegalArgumentException("Unknown align flag: " + align);
        }
    }

    public static void main(String[] args) {
        System.out.println("|" + format("ITEM", 15, '_', 'C') + "|");
    }
}
