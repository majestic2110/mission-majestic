package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.Arrays;

public class CHZ_30Day_ProductofArrayExceptSelf extends AbstractQuestion {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = nums[i - 1] * arr[i - 1];
        }
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * right[i];
        }
        return arr;
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_ProductofArrayExceptSelf test = new CHZ_30Day_ProductofArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        System.out.println("Single No. Without Repetition := " + Arrays.toString(test.productExceptSelf(nums)));
    }
}
