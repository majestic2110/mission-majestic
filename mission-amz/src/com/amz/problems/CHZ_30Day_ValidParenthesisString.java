package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_ValidParenthesisString extends AbstractQuestion {

    public boolean checkValidString(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int open = 0;
        int close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                close++;
            } else if (ch == ')') {
                open--;
                close--;
            } else {
                open--;
                close++;

            }
            if (close < 0) {
                return false;
            }
            if (open < 0) {
                open = 0;
            }
        }
        return open == 0;
    }

}
