package org.InterviewCodingQuestion;

public class StringReversal {

    static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    static String reverseStringUsingStringBuilder(String str){
        StringBuilder builder = new StringBuilder();
        for(int i=str.length()-1;i>0;i--){
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed String: " + reverseString("Hello World"));
        System.out.println("Reversed String using StringBuilder: " + reverseStringUsingStringBuilder("Hello World"));
    }
}
