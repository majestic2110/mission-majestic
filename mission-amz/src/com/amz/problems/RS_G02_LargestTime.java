package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class RS_G02_LargestTime extends AbstractQuestion {
    public String largestTimeFromDigits(int[] A) {
        if (A == null || A.length == 0) {
            return "";
        }
        int maxTime = Integer.MIN_VALUE;
        for (int t0 = 0; t0 < 4; t0++) {
            for (int t1 = 0; t1 < 4; t1++) {
                if (t1 != t0) {
                    for (int t2 = 0; t2 < 4; t2++) {
                        if (t2 != t0 && t2 != t1) {
                            int t3 = 6 - t0 - t1 - t2;
                            int hrs = 10 * A[t0] + A[t1];
                            int mins = 10 * A[t2] + A[t3];
                            if (hrs < 24 && mins < 60) {
                                maxTime = Math.max(maxTime, hrs * 60 + mins);
                            }
                        }
                    }
                }
            }
        }
        return maxTime >= 0 ? String.format("%02d:%02d", maxTime / 60, maxTime % 60) : "";
    }

    @Override
    @Test
    public void evaluate() {
        RS_G02_LargestTime test = new RS_G02_LargestTime();
        int[] nums = {1, 2, 3, 4};
        System.out.println("Max Time := " + test.largestTimeFromDigits(nums));
    }
}
