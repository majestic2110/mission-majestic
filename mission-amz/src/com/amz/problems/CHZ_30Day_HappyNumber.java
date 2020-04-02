package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class CHZ_30Day_HappyNumber extends AbstractQuestion {
    public boolean isHappy(int n) {
        if (n == 0) {
            return false;
        }
        int slow = n;
        int fast = next(n);
        while (slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return slow == 1;
    }

    private int next(int n) {
        int x = 0;
        while (n > 0) {
            int digit = n % 10;
            x += digit * digit;
            n = n / 10;
        }
        return x;
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_HappyNumber test = new CHZ_30Day_HappyNumber();
        System.out.println("Is Happy Number := " + test.isHappy(167));
    }
}
