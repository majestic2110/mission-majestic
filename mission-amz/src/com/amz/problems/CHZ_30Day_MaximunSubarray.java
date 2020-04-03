package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class CHZ_30Day_MaximunSubarray extends AbstractQuestion {

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

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_MaximunSubarray test = new CHZ_30Day_MaximunSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Length of Maximum sum sub-array := " + test.maxSubArray(nums));
    }
}
