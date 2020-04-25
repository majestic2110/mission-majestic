package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashMap;
import java.util.Map;

public class IP_G_FruitIntoBasket extends AbstractQuestion {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0) {
            return 0;
        }
        int maxCount = 0;
        int end = 0;
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (end = 0; end < tree.length; end++) {
            map.put(tree[end], map.getOrDefault(tree[end], 0) + 1);
            while (map.size() > 2) {
                map.put(tree[start], map.get(tree[start]) - 1);
                if (map.get(tree[start]) == 0) {
                    map.remove(tree[start]);
                }
                start++;
            }
            maxCount = Math.max(maxCount, end - start + 1);
        }
        return maxCount;
    }

    @Override
    public void simulate() {
        IP_G_FruitIntoBasket test = new IP_G_FruitIntoBasket();
        int[] tree = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println("Max Fruits collected := " + test.totalFruit(tree));
    }
}
