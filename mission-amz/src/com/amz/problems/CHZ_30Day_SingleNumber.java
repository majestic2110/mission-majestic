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

}
