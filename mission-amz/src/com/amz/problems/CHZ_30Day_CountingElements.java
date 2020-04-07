package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CHZ_30Day_CountingElements extends AbstractQuestion {
    public int countElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], count + 1);
        }
        int count = 0;
        for (Integer item : map.keySet()) {
            if (map.containsKey(item + 1)) {
                count += map.get(item);
            }
        }
        return count;
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_CountingElements test = new CHZ_30Day_CountingElements();
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 2, 1, 1, 1};
        System.out.println("No. of Elements := " + test.countElements(nums));
    }
}
