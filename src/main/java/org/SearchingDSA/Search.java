package org.SearchingDSA;

public class Search {

    public boolean checkELementFoundOrNotUsingLeanearSearch(int arr[],int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return true;
            }
        }
        return false;
    }

    public boolean checkForElementFoundOrNotUsingBinarySearch(int arr[], int search){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end) /2;
            if(arr[mid]==search){
                return true;
            }
            else if(search<arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
