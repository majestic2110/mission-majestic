package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class CHZ_30Day_SearchInRotatedSortedArray extends AbstractQuestion {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int lo = 0;
        int hi = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                lo = i;
                break;
            }
        }
        if (lo > 0) {
            if (target < nums[lo] || target > nums[lo - 1]) {
                return -1;
            }
            if (target > nums[hi]) {
                hi = lo - 1;
                lo = 0;
            }
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[lo] < target) {
                lo++;
            } else {
                hi--;
            }
        }
        return -1;
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_SearchInRotatedSortedArray test = new CHZ_30Day_SearchInRotatedSortedArray();
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("Element found at location := " + test.search(nums, 6));
    }
}
