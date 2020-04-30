package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashMap;
import java.util.Map;

public class CHZ_30Day_CountingElements extends AbstractQuestion {
    public int countElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            int count = map.getOrDefault(value, 0);
            map.put(value, count + 1);
        }
        int count = 0;
        for (Integer item : map.keySet()) {
            if (map.containsKey(item + 1)) {
                count += map.get(item);
            }
        }
        return count;
    }

}
