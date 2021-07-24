package com.example.calculator;

public class Analyzer {
    public static boolean isArabicOrRoman(String in) throws IllegalArgumentException {
        String[] strings = in.split("\\s+");
        if (isArabic(strings[0], strings[2]))
            return true;
        else if (isRoman(strings[0], strings[2]))
            return false;
        else
            throw new IllegalArgumentException();
    }

    private static boolean isArabic(String a, String b) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return x >= 1 && x <= 10 && y >= 1 && y <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isRoman(String a, String b) {
        try {
            RomanNumeral x = RomanNumeral.valueOf(a);
            RomanNumeral y = RomanNumeral.valueOf(b);
            return x.getValue() >= 1 && x.getValue() <= 10 && y.getValue() >= 1 && y.getValue() <= 10;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}