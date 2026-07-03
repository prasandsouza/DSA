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
        List<Integer> gcdNumbers = new ArrayList<>();

    }

    public static void main(String[] args) {
        int number = 89;
        System.out.println("Squares of numbers from 1 to "+number+" are: "+ getSquaresOfNumber(number));
        System.out.println("Cubes of numbers from 1 to "+(number)+" are: "+ getCubesOfNumber(number));
        System.out.println("Numbers divisible by 7 from 1 to "+(number)+" are: "+ getNumberDivisibleby(1, number));
    }
}
