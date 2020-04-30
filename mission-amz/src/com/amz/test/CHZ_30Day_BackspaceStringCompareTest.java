package com.amz.test;

import com.amz.problems.CHZ_30Day_BackspaceStringCompare;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_BackspaceStringCompareTest {
    @Test
    public void validateCompare() {
        CHZ_30Day_BackspaceStringCompare test = new CHZ_30Day_BackspaceStringCompare();
        String s1 = "a#b#c";
        String s2 = "cbn##";
        assertTrue(test.backspaceCompare(s1, s2));
        assertTrue(test.backspaceCompareII(s1, s2));
    }
}
