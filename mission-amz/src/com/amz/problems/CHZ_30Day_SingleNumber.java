package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_SingleNumber extends AbstractQuestion {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int num = 0;
        for (int element : nums) {
            num ^= element;
        }
        return num;
    }

    @Override
    public void simulate() {
        CHZ_30Day_SingleNumber test = new CHZ_30Day_SingleNumber();
        int[] nums = {3, 3, 1, 2, 1, 2, 4, 5, 4};
        System.out.println("Single No. Without Repetition := " + test.singleNumber(nums));
    }
}
