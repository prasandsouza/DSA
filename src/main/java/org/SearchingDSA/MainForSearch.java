package org.SearchingDSA;

public class MainForSearch {

    public static void main(String[] args) {
        Search s = new Search();
        System.out.println(s.checkELementFoundOrNotUsingLeanearSearch(new int[]{1, 2, 3, 4, 5,6}, 2));
        System.out.println(s.checkForElementFoundOrNotUsingBinarySearch(new int[]{1, 2, 3, 4, 5,6}, 1));
    }
}
