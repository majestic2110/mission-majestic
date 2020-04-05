package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class RS_G02_RangeSum extends AbstractQuestion {
    class NumArray {
        private int nums;
        private int[] sums;

        public NumArray(int[] nums) {
            this.nums = nums == null ? 0 : nums.length;
            sums = new int[this.nums];
            if (this.nums > 0) {
                sums[0] = nums[0];
                for (int i = 1; i < this.nums; i++) {
                    sums[i] = sums[i - 1] + nums[i];
                }
            }
        }

        public void update(int i, int val) {
            int valChange = i == 0 ? val - sums[0] : val - (sums[i] - sums[i - 1]);
            if (valChange != 0) {
                for (int j = i; j < nums; j++) {
                    sums[j] += valChange;
                }
            }
        }

        public int sumRange(int i, int j) {
            return i == 0 ? sums[j] : sums[j] - sums[i - 1];
        }
    }

    @Override
    @Test
    public void evaluate() {
        // to be done
    }
}
