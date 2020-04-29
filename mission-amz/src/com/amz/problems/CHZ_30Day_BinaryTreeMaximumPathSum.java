package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.TreeNode;

public class CHZ_30Day_BinaryTreeMaximumPathSum extends AbstractQuestion {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return this.max;
    }

    private int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));
        this.max = Math.max(left + right + root.val, this.max);
        return root.val + Math.max(left, right);
    }

    @Override
    public void simulate() {
        // to be done
    }
}
