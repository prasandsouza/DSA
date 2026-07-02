package org.DSABasics.LoopingAndPattern.levelTwo;

public class NumberBasedOnLoopingLogic {
    public static void main(String[] args) {
        // count the number of digit in given number
        int number = 234;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);


        // reverse the given number
        int num = 12345;
        int reversed = 0;
        while(num!=0){
            int lastDigit = num%10;
            reversed = lastDigit + reversed * 10;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversed);

        if(num==reversed)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");


        // sum of digit of number
        int sumCheckingDigit = 13253;
        int sum = 0;
        while(sumCheckingDigit>0){
            int lastDigit = sumCheckingDigit%10;
            sumCheckingDigit = sumCheckingDigit/10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of digits: " + sum);



        //Armstrong number



    }
}
