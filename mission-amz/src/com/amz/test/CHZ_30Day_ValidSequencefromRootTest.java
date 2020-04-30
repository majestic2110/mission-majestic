package com.amz.test;

import com.amz.common.TreeNode;
import com.amz.problems.CHZ_30Day_ValidSequencefromRoot;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CHZ_30Day_ValidSequencefromRootTest {
    private TreeNode root;

    public CHZ_30Day_ValidSequencefromRootTest() {
        root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(0);
        root.left.right.right = new TreeNode(0);
    }

    @Test
    public void validateNullArray() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(null, null));
    }

    @Test
    public void validateBlankArray() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(null, new int[]{}));
    }

    @Test
    public void validateNullTree() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(null, new int[]{1}));
    }

    @Test
    public void validateValidSequence() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertTrue(test.isValidSequence(root, new int[]{0, 1, 0, 1}));
    }

    @Test
    public void validateInValidSequence() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(root, new int[]{0, 0, 1}));
    }

    @Test
    public void validateInValidSequence1() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(root, new int[]{0, 1, 1}));
    }

    @Test
    public void validateInValidSequence2() {
        CHZ_30Day_ValidSequencefromRoot test = new CHZ_30Day_ValidSequencefromRoot();
        assertFalse(test.isValidSequence(root, new int[]{0, 1, 0, 1, 1}));
    }
}
