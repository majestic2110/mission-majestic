package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.TreeNode;

public class CHZ_30Day_DiameterofBinaryTree extends AbstractQuestion {
    int dia = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return this.dia - 1;
    }

    private int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        dia = Math.max(left + right + 1, dia);
        return Math.max(left, right) + 1;
    }

    @Override
    public void simulate() {
        // to be done
    }
}
