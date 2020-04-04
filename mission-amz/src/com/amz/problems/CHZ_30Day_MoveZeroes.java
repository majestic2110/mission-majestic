package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Arrays;

public class CHZ_30Day_MoveZeroes extends AbstractQuestion {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_MoveZeroes test = new CHZ_30Day_MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        test.moveZeroes(nums);
        System.out.println("Array after moving zeros := " + Arrays.toString(nums));
    }
}
