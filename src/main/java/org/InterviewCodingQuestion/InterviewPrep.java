package org.InterviewCodingQuestion;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class InterviewPrep {

    public String reverseString(String value){
        StringBuilder builder = new StringBuilder(value);

        builder.reverse();
        StringBuilder reversed = new StringBuilder();

        for(int i=value.length()-1;i>=0;i--){
            reversed.append(value.charAt(i));
        }

        String reversedStream = IntStream.range(0,value.length()).mapToObj(i->String.valueOf(value.charAt(value.length()-i-1))).reduce("",String::concat);

        System.out.println("using for loop :: "+reversed);
        System.out.println("using Stream :: "+reversedStream);
        System.out.println(builder);
        return "";
    }

    public int[] mergeTwoSortedArray(int[] v1,int[] v2){
        int[] mergedArray = new int[v1.length+ v2.length];
        int i = 0, j = 0, k = 0;
        while (i< v1.length && j < v2.length){
            mergedArray[k++] = (v1[i] < v2[j]) ? v1[i++] : v2[j++];
        }
        while (i < v1.length) mergedArray[k++] = v1[i++];
        while (j < v2.length) mergedArray[k++] = v2[j++];
        return mergedArray;
    }

    public int[] mergedTwoSortedArray(int[] a1, int[] a2){
        int i=0,j=0,k=0;
        int[] mergedArray = new int[a1.length+a2.length];
        while (i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                mergedArray[k] = a1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = a2[j];
                j++;
                k++;
            }
        }
        while(i<a1.length && a2.length == j){
            mergedArray[k] = a1[i];
            i++;
            k++;
        }

        while(j<a2.length && a1.length == i){
            mergedArray[k] = a2[j];
            j++;
            k++;
        }
        return  mergedArray;
    }

    public int[] findingTwoSumOnSortedList(int[] a1, int sum){
        if(a1==null){
            return new int[]{};
        }
        int[] sums = new int[]{0,0};
        int i = 0;
        int j = a1.length-1;

        while(i<j){
            if(a1[i]+a1[j]==sum){
                sums[0] = a1[i];
                sums[1] = a1[j];
                break;
            }
            else if(a1[i]+a1[j]<sum){
                i++;
            } else{
                j--;
            }
        }
        return sums;
    }
}
