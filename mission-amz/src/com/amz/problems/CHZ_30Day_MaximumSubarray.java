package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_MaximumSubarray extends AbstractQuestion {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = nums[0];
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(curMax, maxSum);
        }
        return maxSum;
    }

}
