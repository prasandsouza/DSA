package org.DSABasics.Recursion.levelOne;

public class Foundation {

    static int printingNumber(int number){
        if(number==5){
            return 0;
        }
        System.out.println(number);
        return printingNumber(number+1);
    }

    static int printingNumberreverse(int number){
        if(number==0){
            return 0;
        }
        System.out.println(number);
        return printingNumberreverse(number-1);
    }

    static int printingEvenNUmber(int number){
        if(number==0){
            return 0;
        }
        if(number%2==0){
            System.out.println(number);
        }
        return printingEvenNUmber(number-1);
    }

    //factorial of number
    static int factorial(int number){
        if(number==0){
            return 1;
        }
        return number * factorial(number-1);
    }

    // sum of number
    static int sum(int number){
        if(number==0){
            return 1;
        }
        return number + sum(number-1);
    }

    // Fibonacci series
    static int fibonacciSeries(int number){
        if(number == 0){
            return 0;
        }
        if(number==1){
            return 1;
        }
        return fibonacciSeries(number-1) + fibonacciSeries(number-2);
    }

    //print the fibonacci series
    static void printFibonacciSeries(int number){
        if(number<=1){
            return;
        }
        printFibonacciSeries(number-1);
        System.out.print(+fibonacciSeries(number) + " ");
    }

    // sum of digit recursively
    static int sumOfDigit(int number){
        if(number==0){
            return 0;
        }
        return sumOfDigit(number-1) + number;
    }

    public static void main(String[] args) {
        printingNumber(0);
        printingNumberreverse(5);
        printingEvenNUmber(10);
        System.out.println("Factorial of number is: "+factorial(5));
        System.out.println("Sum of number is: "+sum(5));
        System.out.println("Fibonacci series of number is: "+fibonacciSeries(5));
        printFibonacciSeries(6);
        System.out.println("\nSum of digit is: "+sumOfDigit(5));
    }
}
