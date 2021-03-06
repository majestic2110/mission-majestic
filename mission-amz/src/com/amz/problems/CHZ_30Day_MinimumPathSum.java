package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_MinimumPathSum extends AbstractQuestion {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int dp[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) {
                    dp[j] = grid[i][j] + (j > 0 ? dp[j - 1] : 0);
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j], j > 0 ? dp[j - 1] : Integer.MAX_VALUE);
                }
            }
        }
        return dp[grid[0].length - 1];
    }

}
