package org.DSABasics.LoopingAndPattern.levelFive;

public class LogicalLoopingCombination {

    public static void main(String[] args) {

        //print all the number whose sum of digits are even (1-100)
        for(int i=0;i<100;i++){
            int sum = 0;
            int number = i;
            int lastDigit;
            while(number!=0){
                lastDigit = number % 10;
                sum = sum + lastDigit;
                number /=10;
            }
            if(sum%2==0){
                System.out.println("Number whose sum of digits is even: "+i);
            }
        }

        // count the number which are divisible by 7 but not by 5
        for(int i=1;i<=500;i++){
            if(i%7==0 && i%5!=0){
                System.out.println("Number which is divisible by 7 but not by 5: "+i);
            }
        }

        // print all the palindrome number;



    }
}
