package com.example.calculator;

public class Converter {
    public static String arabicToRoman(String in) throws IllegalArgumentException {
        RomanNumeral[] romanNumerals = RomanNumeral.values();
        if (Integer.parseInt(in) < 1)
            throw new IllegalArgumentException();
        return romanNumerals[Integer.parseInt(in) - 1].toString();
    }

    public static String romanToArabic(String in) {
        RomanNumeral romanNumeral = RomanNumeral.valueOf(in);
        return Integer.toString(romanNumeral.getValue());
    }
}
