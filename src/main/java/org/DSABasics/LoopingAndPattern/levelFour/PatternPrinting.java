package org.DSABasics.LoopingAndPattern.levelFour;

public class PatternPrinting {

    public static void main(String[] args) {
        // print a star on same line
        for(int i=0;i<5;i++){
            System.out.print("*");
        }

        // print * in box shape
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Right angle triangle
        for (int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // left angle triangle
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
