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

    public static void main(String[] args) {
        System.out.println(countTheNumberInDigit(12345));
        System.out.println(reverseTheNumberUsingRecurrsion(12345));
    }
}
