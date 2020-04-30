package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_MaximalSquare extends AbstractQuestion {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        int maxOne = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
                } else if (matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                maxOne = Math.max(dp[i][j], maxOne);
            }
        }
        return maxOne * maxOne;
    }

}
