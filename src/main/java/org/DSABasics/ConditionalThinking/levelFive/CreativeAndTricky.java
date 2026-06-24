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
        } else if(day>1 && day <= 28 && month==feb){
            return true;
        } else {
            return false;
        }
    }
}
