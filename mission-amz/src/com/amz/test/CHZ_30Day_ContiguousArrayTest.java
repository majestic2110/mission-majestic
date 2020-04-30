package com.amz.test;

import com.amz.problems.CHZ_30Day_ContiguousArray;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_ContiguousArrayTest {
    @Test
    public void validateMaxLength() {
        CHZ_30Day_ContiguousArray test = new CHZ_30Day_ContiguousArray();
        int[] nums = {0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0};
        assertTrue(test.findMaxLength(nums) == 4);
    }
}
