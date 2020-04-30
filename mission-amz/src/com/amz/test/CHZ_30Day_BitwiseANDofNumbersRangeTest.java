package com.amz.test;

import com.amz.common.AbstractQuestion;
import com.amz.problems.CHZ_30Day_BitwiseANDofNumbersRange;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_BitwiseANDofNumbersRangeTest extends AbstractQuestion {
    @Test
    public void validateAND() {
        CHZ_30Day_BitwiseANDofNumbersRange test = new CHZ_30Day_BitwiseANDofNumbersRange();
        assertTrue(test.rangeBitwiseAnd(5, 7) == 4);
    }
}
