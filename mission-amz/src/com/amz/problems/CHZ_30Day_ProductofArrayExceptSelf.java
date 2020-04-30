package com.amz.problems;

import com.amz.common.AbstractQuestion;

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

    /**
     * with O(1) space
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelfII(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = nums[i - 1] * arr[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] * right;
            right *= nums[i];
        }
        return arr;
    }

}
