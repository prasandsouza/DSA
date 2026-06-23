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

    public String checkDigit(int number){
        if(number>=100){
            return " number is three digit";
        } else if(number>=10){
            return "Number is double digit";
        } else{
            return "number is single digit";
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

    public String checkNumberIsMultipleOfSevenOrStartsOrEndsWithSeven(int number){
        if(number%7==0){
            return "number is multiple of seven";
        } else if(number%10==7){
            return "number is ends with 7";
        } else{
            return "number is not multple of seven also not ends with 7";
        }
    }

    public String checkForCordinates(int x,int y){
        if(x>0 && y>0){
            return "Quadrant1";
        } else if(x<0 && y>0){
            return "Quadrant2";
        } else if(x<0 && y<0){
            return "Quadrant3";
        } else{
            return "Quadrant4";
        }
    }

    public String checkForAmountCalculation(int amount){
        if(amount%2000==0){
           return "Amount is evenly divided into 2000";
        } else if(amount%500==0){
            return "Amount is evenly divided into 500";
        } else {
            return "cannot divide in 2000,500";
        }
    }

    public int checkForThirdAngle(int a, int b){
        return 180-a+b<=0? 0 : 180-(a+b);
    }

    public boolean checkForSquareRoot(int number){
        if (number<0) return false;
        if (number<=1) return true;

        long left = 1;
        long right = number;

        while (left<=right){
          long mid = left +(right -left)/2;
          long square = mid * mid;

          if(square==number){
              return true;
          } else if(square<number){
              left = mid + 1;
          } else {
              right = mid - 1;
          }
        }
        return false;
    }

}
