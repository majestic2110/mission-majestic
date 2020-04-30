package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_BitwiseANDofNumbersRange extends AbstractQuestion {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            n -= (n & -n);
        }
        return n;
    }

}
