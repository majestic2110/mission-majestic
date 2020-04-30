package com.amz.test;

import com.amz.problems.CHZ_30Day_CountingElements;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_CountingElementsTest {
    @Test
    public void simulate() {
        CHZ_30Day_CountingElements test = new CHZ_30Day_CountingElements();
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 2, 1, 1, 1};
        assertTrue(test.countElements(nums) == 10);
    }
}
