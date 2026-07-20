package org.InterviewCodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestion {


    public static int findingOneNonDuplicateElementUsingXOR(int[] arr){
        return 1;
    }



    public static void main(String[] args) {
        System.out.println(findingOneNonDuplicateElementUsingXOR(new int[]{1, 2, 3, 2, 1}));
        InterviewPrep prep = new InterviewPrep();
        prep.reverseString("hello");

        System.out.println(Arrays.toString(prep.mergedTwoSortedArray(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8, 9})));
        System.out.println(Arrays.toString(prep.findingTwoSumOnSortedList(new int[]{1,3,5,7,13,15},12)));
        System.out.println(prep.removingDuplicateFromString("aaabbbaaabbccccccddddddaaaa"));
        System.out.println(prep.findingFrequency(List.of("apple","apple","banana","apple","cheery","apple","sample","banana")));

    }
}
