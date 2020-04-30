package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.TreeNode;

public class CHZ_30Day_ValidSequencefromRoot extends AbstractQuestion {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        return isValidSeq(root, arr, 0);
    }

    private boolean isValidSeq(TreeNode root, int[] arr, int i) {
        if (root == null || i >= arr.length || root.val != arr[i]) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (i == arr.length - 1) {
                return true;
            } else {
                return false;
            }
        }
        return isValidSeq(root.left, arr, i + 1) || isValidSeq(root.right, arr, i + 1);
    }

}
