package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

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

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_BestTimetoBuyandSellStockII test = new CHZ_30Day_BestTimetoBuyandSellStockII();
        int[] prices = {1,2,3,4,5};
        System.out.println("Max profit := " + test.maxProfit(prices));
    }
}
