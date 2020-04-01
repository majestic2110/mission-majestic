package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class IP_G_OddEvenJump extends AbstractQuestion {

    public int oddEvenJumps(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];
        odd[n - 1] = true;
        even[n - 1] = true;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(A[n - 1], n - 1);
        for (int i = n - 2; i >= 0; i--) {
            Map.Entry oddVal = map.ceilingEntry(A[i]);
            Map.Entry evenVal = map.floorEntry(A[i]);
            if (oddVal != null) {
                odd[i] = even[(int) oddVal.getValue()];
            }
            if (evenVal != null) {
                even[i] = odd[(int) evenVal.getValue()];
            }
            map.put(A[i], i);
        }
        int jumps = 0;
        for (boolean isGoodIndex : odd) {
            if (isGoodIndex) {
                jumps++;
            }
        }
        return jumps;
    }

    @Override
    @Test
    public void evaluate() {
        IP_G_OddEvenJump test = new IP_G_OddEvenJump();
        int[] A = {10, 13, 12, 14, 15};
        System.out.println("No. of Jumps := " + test.oddEvenJumps(A));
    }
}
