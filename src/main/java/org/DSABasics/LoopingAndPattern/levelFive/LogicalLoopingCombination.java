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
       for(int i=100;i<=500;i++){
    int originalNumber = i;
    int lastDigit;
    int reversedNumber = 0;
    int temp = originalNumber;
    while(temp != 0){
        lastDigit = temp % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        temp /= 10;
    }
    if(originalNumber == reversedNumber){
        System.out.println("Palindrome number: " + originalNumber);
    }
}

        //print all the number whose digit add up to a multiple of 3
        for(int i=4;i<=100;i++){
            int temp = i;
            int sum = 0;
            int lastDigit = 0;
            while(temp!=0){
                lastDigit = temp % 10 ;
                sum = sum + lastDigit;
                temp = temp /10;
            }
            if(sum%3==0){
                System.out.println("Number whose digits add up to a multiple of 3: " + i);
            }
        }


        // find the smallest and largest digit of given number
        int number = 123456789;
         int smallest = 9;
         int largest = 0;
         int digit;
        while(number!=0){
            digit = number % 10;
            if(number % 10 >largest){
                largest = digit;
            }
            if(number % 10 < smallest){
                smallest = digit;
            }
            number /=10;
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Largest digit: " + largest);

        //print all numbers from 1-n whose binary representation has an even number of 1s

        for(int i=0;i<100;i++){

            int temp = i;
            int temp2 = 0;
            int count = 0;
            int binary ;
            int lastDigit;
            while(temp!=0){
                lastDigit = temp%10;
                temp2 = lastDigit;
                while (temp2!=0){
                    binary = temp2%2;
                    if(binary ==1){
                        count++;
                    }
                    temp2 = temp2-binary;
                    temp2/=2;
                }
                temp/=10;
            }

            if(count%2==0){
                System.out.println("Number whose binary representation has an even number of 1s: "+i);
            }


            /*alternative method
            for(int i=0;i<100;i++){
                int count = Integer.bitCount(i);
                if(count%2==0){
                    System.out.println("Number whose binary representation has an even number of 1s: "+i);
                }
            } */
        }

    }
}
