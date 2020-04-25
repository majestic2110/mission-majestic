package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_JumpGame extends AbstractQuestion {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(max, nums[i] + i);
        }
        return true;
    }

    @Override
    public void simulate() {

    }
}
