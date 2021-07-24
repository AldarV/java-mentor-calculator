package com.example.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException, IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        boolean isArabicOrRoman = Analyzer.isArabicOrRoman(in); // true = arabic, false = roman
        System.out.println(Operator.operand(in, isArabicOrRoman));
        reader.close();
    }
}