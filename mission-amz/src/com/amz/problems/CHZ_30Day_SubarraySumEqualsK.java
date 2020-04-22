package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CHZ_30Day_SubarraySumEqualsK extends AbstractQuestion {

    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.get(sum - k) != null) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_SubarraySumEqualsK test = new CHZ_30Day_SubarraySumEqualsK();
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("Element found at location := " + test.subarraySum(nums, 6));
    }
}
