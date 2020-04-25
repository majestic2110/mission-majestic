package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class RS_G01_LongPressedName extends AbstractQuestion {
    public boolean isLongPressedName(String name, String typed) {
        if (name == null || typed == null || name.length() == 0 || typed.length() == 0) {
            return false;
        }
        if (name.charAt(0) != typed.charAt(0) || typed.length() < name.length()) {
            return false;
        }
        int i = 1;
        int t = 1;
        char prev = name.charAt(0);
        while (t < typed.length()) {
            if (i < name.length() && typed.charAt(t) == name.charAt(i)) {
                prev = name.charAt(i);
                i++;
                t++;
            } else if (typed.charAt(t) == prev) {
                t++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    @Override
    public void simulate() {
        RS_G01_LongPressedName test = new RS_G01_LongPressedName();
        String name = "saeed";
        String typed = "ssaaedd";
        System.out.println("Is Long pressed name := " + test.isLongPressedName(name, typed));
    }
}
