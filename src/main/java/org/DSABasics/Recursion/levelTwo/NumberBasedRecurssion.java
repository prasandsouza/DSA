package org.DSABasics.Recursion.levelTwo;

import java.util.Map;

public class NumberBasedRecurssion {

    static int countTheNumberInDigit(int number){
       if(number==0){
           return 0;
       }
       return 1 +countTheNumberInDigit(number/10);
    }

    static int reverseTheNumberUsingRecurrsion(int number){
        if(number<10){
            return number;
        }
        int digits = (int) Math.log10(number);
        int digit = number %10;
        return (int) (digit * Math.pow(10,digits) + reverseTheNumberUsingRecurrsion(number/10));
    }

    static boolean numberIsPalindromeOrNotUsingRecurrsion(int number){
       if(number<10){
           return true;
       }
       return number == reverseTheNumberUsingRecurrsion(number);

    }

    static int reversed = 0;

    static boolean numberIsPalindromeOrNot(int number,int originalNUmber){
        if(number==0){
            return originalNUmber == reversed;
        }
        reversed = reversed*10 + number%10;
        return numberIsPalindromeOrNot(number/10,originalNUmber);
    }

    public static int productOfNumber(int number,int sum){
        if(number==0) {
            return sum;
        }
        sum *= (number % 10);
        return productOfNumber(number/10,sum);
    }

    public static void main(String[] args) {
        System.out.println(countTheNumberInDigit(12345));
        System.out.println(reverseTheNumberUsingRecurrsion(12345));
        System.out.println(numberIsPalindromeOrNotUsingRecurrsion(12322) ? "Number is Palindrome":"Number is not Palindrome");
        System.out.println(numberIsPalindromeOrNot(12321,12321) ? "Number is Palindrome":"Number is not Palindrome");
        System.out.println(productOfNumber(12345,1));
    }
}
