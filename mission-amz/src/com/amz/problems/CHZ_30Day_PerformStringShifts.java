package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class CHZ_30Day_PerformStringShifts extends AbstractQuestion {
    public String stringShift(String s, int[][] shift) {
        if (s == null || s.isEmpty() || shift == null || shift[0].length == 0) {
            return s;
        }
        int shiftAmt = 0;
        for (int[] amt : shift) {
            shiftAmt += amt[0] == 0 ? amt[1] : -amt[1];
        }
        if (shiftAmt == 0) {
            return s;
        }
        shiftAmt = shiftAmt % s.length();
        if (shiftAmt < 0) {
            shiftAmt = s.length() + shiftAmt;
        }
        StringBuffer buff = new StringBuffer();
        buff.append(s.substring(shiftAmt));
        buff.append(s.substring(0, shiftAmt));
        return buff.toString();
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_PerformStringShifts test = new CHZ_30Day_PerformStringShifts();
        String str = "yisxjwry";
        int[][] shift = {{1, 8}, {1, 4}, {1, 3}, {1, 6}, {0, 6}, {1, 4}, {0, 2}, {0, 1}};
        System.out.println("Shifted string := " + test.stringShift(str, shift));
    }
}
