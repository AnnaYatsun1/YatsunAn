package ru.job4j.max;

import ru.job4j.max.BracketsValidationError;
import ru.job4j.max.Constants;

import java.util.ArrayList;

public class BracketsValidationTask {

    public static String bracketsValidationInString(String str) throws BracketsValidationError {
        ArrayList<Character> list = new ArrayList<Character>();
        for (char elem : str.toCharArray()) {
            switch (elem) {
                case '(':
                    list.add('(');
                    break;
                case ')':
                    checkLastChar(list, '(');
                    break;

            }
        }
        if (list.size() > 0) {
            throw new BracketsValidationError();
        }
        return Constants.BRACKETS_VALIDATION_SUCCESS_TEXT;
    }

    private static void checkLastChar(ArrayList<Character> list, char charToCheck) throws BracketsValidationError {
        int listSize = list.size();
        if (listSize == 0) {
            throw new BracketsValidationError();
        }
        int lastCharInd = list.size() - 1;
        char lastChar = list.get(list.size() - 1);
        if (lastChar != charToCheck) {
            throw new BracketsValidationError();
        } else {
            list.remove(lastCharInd);
        }
    }
}