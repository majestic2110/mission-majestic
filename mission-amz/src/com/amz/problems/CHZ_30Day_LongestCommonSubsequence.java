package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_LongestCommonSubsequence extends AbstractQuestion {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0) {
            return 0;
        }
        text1 = '#' + text1;
        text2 = '#' + text2;
        int[][] dp = new int[text1.length()][text2.length()];
        int maxLCS = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(Math.max(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]);
                }
                maxLCS = Math.max(maxLCS, dp[i][j]);
            }
        }
        return maxLCS;
    }


}
