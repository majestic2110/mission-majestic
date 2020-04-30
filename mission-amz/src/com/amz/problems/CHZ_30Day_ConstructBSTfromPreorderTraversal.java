package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.TreeNode;

public class CHZ_30Day_ConstructBSTfromPreorderTraversal extends AbstractQuestion {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        return toBST(preorder, 0, preorder.length - 1);
    }

    private TreeNode toBST(int[] pre, int start, int end) {
        if (start > end || start >= pre.length || end >= pre.length) {
            return null;
        }
        TreeNode node = new TreeNode(pre[start]);
        int i = -1;
        for (i = start + 1; i <= end; i++) {
            if (pre[i] > node.val) {
                break;
            }
        }
        node.left = toBST(pre, start + 1, i - 1);
        node.right = toBST(pre, i, end);
        return node;
    }

}
