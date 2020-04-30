package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.Collections;
import java.util.PriorityQueue;

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
}
