package org.DSABasics.ConditionalThinking.levelTwo;

import java.util.Arrays;

public class NestedIfAndMultipleCondition {
    int a = 10;
    int b = 20;
    int c = 15;


    public void checkForValidTriangle(){
        int largest = 0;
        int otherThanLargest = 0;
        if(a>b&&a>c){
            largest = a;
            otherThanLargest = b+c;
        } else if(b>c){
           largest = b;
           otherThanLargest = a+c;
        } else {
            largest = c;
            otherThanLargest = a+b;
        }

        if(otherThanLargest>largest){
            System.out.println("it's a valid triangle");
        } else {
            System.out.println("it's a not valid triangle");
        }

        // using array
        int[] side = {a,b,c};
        Arrays.sort(side);
        if(side[0]+side[1]>side[2]){
            System.out.println("valid triangle");
        } else{
            System.out.println("not a valid triangle");
        }

    }

    public  void  checkTypeOftriangle(){
        if(a==b && b==c){
            System.out.println(" it's equilateral Triangle");
        } else if(a==b||a==c || b==c){
            System.out.println("it's a isosceles Triangle");
        } else{
            System.out.println("it's Scalene Triangle");
        }
    }

    public void findingGrades(int marks){
        if(marks<35){
            System.out.println("F");
        } else if(marks<50){
            System.out.println("C");
        } else if(marks<60){
            System.out.println("B");
        }else if(marks<80){
            System.out.println("A");
        } else{
            System.out.println("A+");
        }

    }

    public void findingMultiple(int a, int b){
        if(b*b%a==0){
            System.out.println("a is multiple of B");
        } else if(a*a%b==0){
            System.out.println("b is multiple of A");
        } else{
            System.out.println("None is multiple");
        }
    }

    public void dayWishes(int hour){
        if(hour>24 || hour<0){
            System.out.println("please provide valid hours");
        } else if(hour>5 && hour<12){
            System.out.println("Good Morning");
        } else if(hour>=12 && hour <= 15){
            System.out.println("Good after noon");
        } else if(hour>15 && hour<21){
            System.out.println("Good Evening");
        } else {
            System.out.println("Good gIght ");
        }
    }

    public void evenOrOddCheck(int a,int b){
        if(a%2==0 && b%2==0){
            System.out.println("Both numbers are even");
        } else if(a%2==0 || b%2==0){
            System.out.println("One of number is even");
        } else{
            System.out.println("both are odd");
        }
    }
}
