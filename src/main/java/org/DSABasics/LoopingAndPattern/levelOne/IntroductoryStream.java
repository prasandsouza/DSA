package org.DSABasics.LoopingAndPattern.levelOne;
import java.util.*;
import java.util.stream.*;

public class IntroductoryStream {

    public static void main(String[] args) {
        // Example of using Stream API to print numbers from 0 to 4
        IntStream.range(0, 5).forEach(i -> System.out.println("Stream Loop: " + i));


        IntStream.range(0,10).forEach(i->{
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
        });

        int sumOfEvenNumber = IntStream.range(0,10).filter(i->i%2==0).sum();
        System.out.println("Sum of all even number is: "+sumOfEvenNumber);

        int factorialOfNumber = IntStream.range(1,10).reduce(1, (i, j) -> i * j);
        System.out.println("Factorial of number is: "+factorialOfNumber);
    }
}
