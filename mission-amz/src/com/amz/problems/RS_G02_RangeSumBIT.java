package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class RS_G02_RangeSumBIT extends AbstractQuestion {
    class NumArray {
        private int n;
        private int[] bit;
        private int[] nums;

        public NumArray(int[] nums) {
            this.n = nums == null ? 0 : nums.length;
            this.nums = nums;
            this.bit = new int[this.n + 1];
            if (this.n > 0) {
                buildBIT();
            }
        }

        private void buildBIT() {
            for (int i = 0; i < this.bit.length - 1; i++) {
                updateVal(i, this.nums[i]);
            }
        }

        public void update(int i, int val) {
            int diff = val - this.nums[i];
            this.nums[i] = val;
            updateVal(i, diff);
        }

        private void updateVal(int i, int val) {
            i++;
            while (i < this.bit.length) {
                this.bit[i] += val;
                i = next(i);
            }
        }

        private int lastBit(int i) {
            return (i & -i);
        }

        private int next(int i) {
            return i + lastBit(i);
        }

        private int parent(int i) {
            return i - lastBit(i);
        }

        private int sum(int i) {
            i++;
            int sum = 0;
            while (i > 0) {
                sum += this.bit[i];
                i = parent(i);
            }
            return sum;
        }

        public int sumRange(int i, int j) {
            return sum(j) - sum(i - 1);
        }
    }

    @Override
    public void simulate() {
        int[] nums = {1, 3, 5};
        NumArray test = new NumArray(nums);
        System.out.println("Sum := " + test.sumRange(0, 2));
    }
}
