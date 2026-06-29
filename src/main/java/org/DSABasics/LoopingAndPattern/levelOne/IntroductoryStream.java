package org.DSABasics.LoopingAndPattern.levelOne;
import java.util.*;
import java.util.stream.*;

public class IntroductoryStream {

    public static void main(String[] args) {
        // Example of using Stream API to print numbers from 0 to 4
        IntStream.range(0, 5).forEach(i -> System.out.println("Stream Loop: " + i));
    }
}
