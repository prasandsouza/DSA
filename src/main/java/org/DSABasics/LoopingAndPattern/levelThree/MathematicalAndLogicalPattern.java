package org.DSABasics.LoopingAndPattern.levelThree;

import java.util.*;

public class MathematicalAndLogicalPattern {

    // squares of number
    static List<Integer> getSquaresOfNumber(int squaresNumber){
        List<Integer> squares = new ArrayList<>();
        for(int i=1;i<=squaresNumber;i++){
            squares.add(i*i);
        }
        return squares;
    }

    //finding the cubes of number
    static List<Integer> getCubesOfNumber(int cubeNumber){
        List<Integer> cubes = new ArrayList<>();
        for(int i=1;i<=cubeNumber;i++){
            cubes.add(i*i*i);
        }
        return cubes;
    }

    // finding number divisible by 7
    static List<Integer> getNumberDivisibleby(int a,int b){
        List<Integer> divisibleNumbers = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(i%7==0){
                divisibleNumbers.add(i);
            }
        }
        return divisibleNumbers;
    }

    // finding GCD of number
    static int findingGCD(int a,int b){
        int largest ;
        int smallest;

        int temp = 0;
        if(a>b){
            largest = a;
            smallest = b;
        } else{
            largest = b;
            smallest = a;
        }

        while (smallest!=0){
            temp = smallest;
            smallest = largest%smallest;
            largest = temp;
        }
        return temp;
    }

    static int findingLcm(int a,int b){
        return a*b/findingGCD(a,b);
    }

    //finding factors of number
    static List<Integer> findingFactors(int number){
        List<Integer> factors = new ArrayList<>();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors.add(i);
            }
        }
        return factors;
    }

    // finding sum of factors of number
    static int findingSumOfFactors(int number){
        List<Integer> factors = findingFactors(number);
        int sum = 0;
        for(int i = 0;i<factors.size();i++){
            sum+= factors.get(i);
        }
        return sum;
    }

    //armStrongNumber
    static boolean findingArmStrongNumber(int number){
        int count = 0;
        int originalNumber = number;
        int countingNumber = number;
        int sum = 0;
        while (number!=0){
            number = number/10;
            count++;
        }
        while (originalNumber!=0){
            int lastDigit = originalNumber%10;
            originalNumber = originalNumber/10;
            sum += (int) Math.pow(lastDigit,count);
        }
        return sum==countingNumber;
    }

    public static void main(String[] args) {
        int number = 89;
        System.out.println("Squares of numbers from 1 to "+number+" are: "+ getSquaresOfNumber(number));
        System.out.println("Cubes of numbers from 1 to "+(number)+" are: "+ getCubesOfNumber(number));
        System.out.println("Numbers divisible by 7 from 1 to "+(number)+" are: "+ getNumberDivisibleby(1, number));
        System.out.println("GCD of 3768 and 1701 is: "+findingGCD(3768,1701));
        System.out.println("LCM of 12 and 18 is: "+findingLcm(12,18));
        System.out.println("Factors of "+number+" are: "+findingFactors(24));
        System.out.println("Sum of factors of "+number+" is: "+findingSumOfFactors(24));
        System.out.println("Is 153 an Armstrong number? "+findingArmStrongNumber(370));
    }
}
