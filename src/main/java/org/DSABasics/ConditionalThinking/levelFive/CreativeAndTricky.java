package org.DSABasics.ConditionalThinking.levelFive;

import java.util.Arrays;
import java.util.List;

public class CreativeAndTricky {

    public boolean dateAndMonthCheck(String date){
        String[] dateArray = date.split("-");
        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        List<Integer> oddMonth = Arrays.asList(1,3,5,7,8,10,12);
        List<Integer> evenMonth = Arrays.asList(4,6,9,11);
        int feb = 2;
        if(day>1 && day <= 31 && oddMonth.contains(month)){
            return true;
        } else if(day>1 && day <= 30 && evenMonth.contains(month)) {
            return true;
        } else return day > 1 && day <= 28 && month == feb;
    }

    public double angleBetweenHoursAndMinutes(int hours, int minutes){
        if (hours == 12) {       hours = 0;    }
        double hourAngle = (hours * 30) + (minutes * 0.5); //922.5
        double minuteAngle = minutes * 6; //270
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }

    public  double angleBetweenHoursAndMinutesSecond(int hours, int min){
        if(hours==12){
            hours = 0;
        }
        int hourAngle = hours * 5;
        return Math.abs(hourAngle - min) * 6;
    }
    
    public String checkWhichDateComesFirst(String date1, String date2){
        String[] dateArray1 = date1.split("-");
        String[] dateArray2 = date2.split("-");
        int day1 = Integer.parseInt(dateArray1[0]);
        int month1 = Integer.parseInt(dateArray1[1]);
        int year1 = Integer.parseInt(dateArray1[2]);

        int day2 = Integer.parseInt(dateArray2[0]);
        int month2 = Integer.parseInt(dateArray2[1]);
        int year2 = Integer.parseInt(dateArray2[2]);

        if(year2>year1){
            return date1 + " comes first";
        } else if (year1>year2) {
            return date2 + " comes first";
        } else{
            if(month1<month2){
                return date1 + " comes first";
            } else if(month2<month1){
                return date2 + " comes first";
            } else{
                if(day1<day2){
                    return date1 + " comes first";
                } else if(day2<day1){
                    return date2 + " comes first";
                } else{
                    return "Both dates are same";
                }
            }
            
        }
    }
}
