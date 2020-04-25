package com.amz.problems;

import com.amz.common.AbstractQuestion;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_BitwiseANDofNumbersRange extends AbstractQuestion {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            n -= (n & -n);
        }
        return n;
    }

    @Override
    public void simulate() {
        CHZ_30Day_BitwiseANDofNumbersRange test = new CHZ_30Day_BitwiseANDofNumbersRange();
        assertTrue(test.rangeBitwiseAnd(5, 7) == 4);
    }
}
