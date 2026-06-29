package org;

import org.DSABasics.ConditionalThinking.levelFive.CreativeAndTricky;
import org.DSABasics.ConditionalThinking.levelFour.LogicalOperatorAndCompoundStatement;
import org.DSABasics.ConditionalThinking.levelOne.SimpleIf;
import org.DSABasics.ConditionalThinking.levelThree.MathAndNumberLogic;
import org.DSABasics.ConditionalThinking.levelTwo.NestedIfAndMultipleCondition;


public class Main {
    public static void main(String[] args) {
        SimpleIf simpleIf = new SimpleIf();

        simpleIf.checkingSimpleIf();


        NestedIfAndMultipleCondition nestedIfAndMultipleCondition  = new NestedIfAndMultipleCondition();
        nestedIfAndMultipleCondition.checkForValidTriangle();
        nestedIfAndMultipleCondition.checkTypeOftriangle();
        nestedIfAndMultipleCondition.findingGrades(65);
        nestedIfAndMultipleCondition.findingMultiple(100,13);
        nestedIfAndMultipleCondition.findingMultiple(10,30);
        nestedIfAndMultipleCondition.dayWishes(12);
        nestedIfAndMultipleCondition.dayWishes(-65);


        MathAndNumberLogic mathAndNumberLogic = new MathAndNumberLogic();
        System.out.println(mathAndNumberLogic.findingWeek(4));
        System.out.println(mathAndNumberLogic.findingWeek(0));
        System.out.println(mathAndNumberLogic.checkDigit(4));
        System.out.println(mathAndNumberLogic.checkNumberIsMultipleOfSevenOrStartsOrEndsWithSeven(777));

        System.out.println(mathAndNumberLogic.checkForCordinates(-8,7));

        System.out.println(mathAndNumberLogic.checkForThirdAngle(89,23));


        LogicalOperatorAndCompoundStatement logicalOperatorAndCompoundStatement = new LogicalOperatorAndCompoundStatement();


        System.out.println(logicalOperatorAndCompoundStatement.passwordValidation("123456dfgh5") ? "Valid Password" : "invalid password");
        CreativeAndTricky creativeAndTricky = new CreativeAndTricky();
        System.out.println(creativeAndTricky.dateAndMonthCheck("28-02-2024") ? "Valid Date" : "invalid date");


        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutes(10,45));

        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutes(3, 30));   // 75.02
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutes(12, 0));   // 0.03
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutes(6, 0));    // 180.04
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutes(9, 45));   // 22.5


        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutesSecond(3, 30));   // 75.02
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutesSecond(12, 0));   // 0.03
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutesSecond(6, 0));    // 180.04
        System.out.println(creativeAndTricky.angleBetweenHoursAndMinutesSecond(9, 45));


    }
}