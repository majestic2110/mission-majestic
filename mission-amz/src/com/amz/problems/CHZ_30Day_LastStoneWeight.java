package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_LastStoneWeight extends AbstractQuestion {
    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            if (x != y) {
                pq.offer(x - y);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();

    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_LastStoneWeight test = new CHZ_30Day_LastStoneWeight();
        int[] stones = {2, 7, 4, 1, 8, 1};
        assertTrue(test.lastStoneWeight(stones) == 1);
    }
}
