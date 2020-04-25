package com.amz.problems.test;

import com.amz.problems.CHZ_30Day_JumpGame;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CHZ_30Day_JumpGameTest extends CHZ_30Day_JumpGame {

    @Test
    public void validateNullInput() {
        CHZ_30Day_JumpGameTest test = new CHZ_30Day_JumpGameTest();
        assertFalse(test.canJump(null));
    }

    @Test
    public void validateEmptyInput() {
        CHZ_30Day_JumpGameTest test = new CHZ_30Day_JumpGameTest();
        assertFalse(test.canJump(new int[]{}));
    }

    @Test
    public void validatePositiveInput() {
        CHZ_30Day_JumpGameTest test = new CHZ_30Day_JumpGameTest();
        assertTrue(test.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void validateNegativeInput() {
        CHZ_30Day_JumpGameTest test = new CHZ_30Day_JumpGameTest();
        assertFalse(test.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void validateOnlyZeroInput() {
        CHZ_30Day_JumpGameTest test = new CHZ_30Day_JumpGameTest();
        assertFalse(test.canJump(new int[]{0, 0, 0, 0}));
    }
}
