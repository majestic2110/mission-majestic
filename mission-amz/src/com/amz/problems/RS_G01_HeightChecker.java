package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Arrays;

public class RS_G01_HeightChecker extends AbstractQuestion {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }
        int[] copy = Arrays.copyOf(heights, heights.length);
        // counting sort can also be used for limited cases.
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    @Override
    @Test
    public void evaluate() {
        RS_G01_HeightChecker test = new RS_G01_HeightChecker();
        int[] tree = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println("No. of Students required to change places := " + test.heightChecker(tree));
    }
}
