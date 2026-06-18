package org;

import org.DSABasics.ConditionalThinking.levelOne.SimpleIf;
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
    }
}