package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_MoveZeroes extends AbstractQuestion {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

}
