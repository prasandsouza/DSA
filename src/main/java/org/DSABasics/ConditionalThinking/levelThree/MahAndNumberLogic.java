package org.DSABasics.ConditionalThinking.levelThree;

public class MahAndNumberLogic {

    private int a = 546;

    private void checkingDistinctElement(){
       if(a>999 || a <100){
           System.out.println("please enter valid number");
       } else{
           int hundred = a/100;
           int tens = (a/10)%10;
           int digit = a%10;

           if(hundred==tens || hundred == digit || digit == tens){
               System.out.println("Two element are same");
           } else {
               System.out.println("All element are distinct");
           }
       }
    }
}
