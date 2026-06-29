package org.DSABasics.LoopingAndPattern.levelOne;

public class IntroductoryLoop {

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // do-while loop
        int k = 5;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k < 5);


        for(int i=0; i<100;i++){
            if(i%2==0) {
                System.out.println("Even number: " + i);
            }
            if(i%2!=0){
                System.out.println("Odd number: "+i);
            }
        }

        for(int i=10;i>=1;i--){
            System.out.println("Decrementing number: "+i);
        }


        for (int i=0;i<10;i++){
            System.out.println("Square of Number is:"+i+" "+i*i);
        }

        for(int i=0;i<=10;i++){
            System.out.println("2 nd table" +i*2);
        }

        // sum of all natural number
        int sum = 0;
        for(int i=0;i<=10;i++){
            sum = sum + i;
        }
        System.out.println("Sum of all natural number is: "+sum);

        // sum of all odd number
        int oddSum = 0;
        for (int i=0;i<=10;i++){
            if(i%2!=0){
                oddSum = oddSum + i;
            }
        }
        System.out.println("Sum of all odd number is: "+oddSum);


        // find the factorial of number
        int factNumber = 1;
        for(int i=1;i<=10;i++) {
            factNumber = factNumber * i;
        }
        System.out.println("Factorial of number is: "+factNumber);
    }
}
