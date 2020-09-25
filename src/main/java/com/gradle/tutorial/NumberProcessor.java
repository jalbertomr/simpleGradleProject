package com.gradle.tutorial;

public class NumberProcessor {
    public static void main(String[] args) {
        for (int i = 1;  i < 100; i++){
            System.out.println( convert(i));
        }
    }

    public static String convert(int numberProcessor) {
        if ( numberProcessor % 15 == 0) {
            return "tresYcinco";
        }
        if ( numberProcessor % 3 == 0) {
            return "tres";
        }
        if ( numberProcessor % 5 == 0) {
            return "cinco";
        }
        return String.valueOf(numberProcessor);
    }
}
