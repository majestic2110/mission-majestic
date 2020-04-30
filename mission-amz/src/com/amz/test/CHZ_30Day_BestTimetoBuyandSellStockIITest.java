package com.amz.test;

import com.amz.problems.CHZ_30Day_BestTimetoBuyandSellStockII;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_BestTimetoBuyandSellStockIITest {
    @Test
    public void validateProfit() {
        CHZ_30Day_BestTimetoBuyandSellStockII test = new CHZ_30Day_BestTimetoBuyandSellStockII();
        int[] prices = {1, 2, 3, 4, 5};
        assertTrue(test.maxProfit(prices) == 4);
    }
}
