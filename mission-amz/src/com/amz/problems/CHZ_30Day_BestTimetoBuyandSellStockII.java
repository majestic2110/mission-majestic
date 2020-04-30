package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class CHZ_30Day_BestTimetoBuyandSellStockII extends AbstractQuestion {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int t_ki0 = 0;
        int t_ki1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int t_ki0_old = t_ki0;
            t_ki0 = Math.max(t_ki0, t_ki1 + prices[i]);
            t_ki1 = Math.max(t_ki1, t_ki0_old - prices[i]);
        }
        return t_ki0;
    }

}
