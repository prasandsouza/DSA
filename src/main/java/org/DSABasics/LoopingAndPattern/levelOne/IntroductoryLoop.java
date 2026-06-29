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
    }
}
