package org.DSABasics.ConditionalThinking.levelFour;


import java.util.stream.Stream;

public class LogicalOperatorAndCompoundStatement {


    public String checkForInput(char a){
        if(Character.isDigit(a)){
            return "Digit";
        } else if(Character.isLetter(a)){
            return "letter";
        } else{
            return "Neither";
        }


    }
    public String checkForInputSecond(char a){
        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            return "it's charecter";
        } else if(a>=0 && a<=9){
            return " it's a Number";
        } else{
            return "it's neither number nor letter";
        }
    }

    public Boolean passwordValidation(String pwd){
        if(pwd.length()<=8){
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;

        for(int i=0;i<pwd.length();i++){
            int a = pwd.charAt(i);
            if(Character.isLetter(a)){
                hasLetter = true;
            }
            if(Character.isDigit(a)){
                hasDigit = true;
            }
        }
        return hasDigit && hasLetter;
    }


}
