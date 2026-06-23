package org.DSABasics.ConditionalThinking.levelThree;

public class MathAndNumberLogic {

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

    public void convertIntegerIntoArray(){

        int[] arrayValue  = Integer.toString(a).chars().map(c->c-'0').toArray();
        int[] digitArray = new int[]{a};

    }

    public void checkDigit(int number){
        if(number>=100){
            System.out.println(" number is three digit");
        } else if(number>=10){
            System.out.println("Number is double digit");
        } else{
            System.out.println("number is single digit");
        }
    }

    public String findingWeek(int days){
        return switch (days) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
    }


}
