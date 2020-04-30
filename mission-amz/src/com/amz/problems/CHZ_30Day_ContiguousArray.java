package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashMap;
import java.util.Map;

public class CHZ_30Day_ContiguousArray extends AbstractQuestion {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int maxLen = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                maxLen = i + 1;
            }
            Integer start = sumMap.get(sum);
            if (start != null) {
                maxLen = Math.max(maxLen, i - start);
            } else {
                sumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
