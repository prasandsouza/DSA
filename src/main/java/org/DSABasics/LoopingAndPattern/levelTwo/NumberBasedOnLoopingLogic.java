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



        // perfect number
        int perfectNumber = 28;
        int sumOfDivisor = 0;
        for(int i=1;i<perfectNumber;i++){
            if(perfectNumber%i==0){
                sumOfDivisor = sumOfDivisor+i;
            }
        }
        if(perfectNumber==sumOfDivisor){
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }


        // checking prime number from 1 to 100;

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" is a prime number.");
            }
        }


        // check if given number is prime or not
        int primeChecker = 23;
        boolean isPrime = true;
        for(int i=2;i<primeChecker;i++){
            if(primeChecker%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(primeChecker+" is a prime number.");
        } else {
            System.out.println(primeChecker+" is not a prime number.");
        }



        // Fibonacci number
        int fib = 3;
        int first = 0;
        int second = 1;
        int prev = first + second;
        for(int i=3;i<fib;i++){
            prev = prev+ second;
            second = prev - second;
        }
        System.out.println("Fibonacci number at position "+fib+" is: "+prev);
    }
}
