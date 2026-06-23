package org.DSABasics.ConditionalThinking.levelOne;

public class SimpleIf {
    int number = 99;


    public void checkingSimpleIf() {
        if (number < 0) {
            System.out.println("number is negative");
        } else if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is ZERO");
        }

        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        if (number % 5 == 0) {
            System.out.println("number is divisible by 5");
        } else {
            System.out.println("number is not divisible by 5");
        }

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("number is divisible by both 3 and 5 ");
        } else if (number % 3 == 0) {
            System.out.println("number is divisible by 3 only");
        } else {
            System.out.println("number is not divisible by 3 or 5");
        }

        int year = 2014;

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("provided year is leap year");
                } else {
                    System.out.println("year is not leap year");
                }
            } else {
                System.out.println("Provided year is Leap year");
            }
        } else {
            System.out.println("not a leap year");
        }


        int a = 45;
        int b = 30;
        int c = 56;

        if (a < b) {
            System.out.println("A is less than B");
        } else {
            System.out.println("A is greater than B");
        }

        if (a >= b && a >= c) {
            System.out.println("A is Largest number");
        } else if (b >= c) {
            System.out.println("B is Largest number");
        } else {
            System.out.println("c is the largest number");
        }

        char checkingChar = 'a';

        char ch = Character.toLowerCase(checkingChar);
        if ("aeiou".indexOf(ch) >= 0) {
            System.out.println("given character is a vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("given character is a consonant");
        } else {
            System.out.println("given character is not an alphabetic letter");
        }

        char secChar = '0';
        if (Character.isUpperCase(secChar)) {
            System.out.println("given character is uppercase");
        } else if (Character.isLowerCase(secChar)) {
            System.out.println("given character is lowercase");
        } else if (Character.isDigit(secChar)) {
            System.out.println("given character is a digit");
        } else {
            System.out.println("given character is not an alphabetic letter");
        }
    }



}
