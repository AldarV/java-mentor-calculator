package com.example.calculator;

public class Operator {
    public static String operand(String in, boolean flag) {
        int a, b, res = 0;
        String[] strings = in.split("\\s+");

        if (!flag) {
            a = Integer.parseInt(Converter.romanToArabic(strings[0]));
            b = Integer.parseInt(Converter.romanToArabic(strings[2]));
        } else {
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
        }
        switch (strings[1]) {
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            case "*" -> res = a * b;
            case "/" -> res = a / b;
        }
        if (!flag)
            return Converter.arabicToRoman(Integer.toString(res));
        else
            return Integer.toString(res);
    }
}
