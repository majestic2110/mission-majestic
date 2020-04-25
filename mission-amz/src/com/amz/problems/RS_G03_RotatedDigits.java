package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RS_G03_RotatedDigits extends AbstractQuestion {
    Set<Integer> validOnes = new HashSet<>(Arrays.asList(0, 1, 8));
    Set<Integer> validTwos = new HashSet<>(Arrays.asList(2, 5, 6, 9));

    public int rotatedDigits(int N) {
        if (N <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (goodNum(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean goodNum(int num) {
        boolean good = false;
        while (num > 0) {
            int x = num % 10;
            if (validOnes.contains(x)) {
                // do nothing
            } else if (validTwos.contains(x)) {
                good = true;
            } else {
                good = false;
                break;
            }
            num = num / 10;
        }
        return good;
    }

    @Override
    public void simulate() {
        RS_G03_RotatedDigits test = new RS_G03_RotatedDigits();
        System.out.println("Good numbers := " + test.rotatedDigits(100));
    }
}
