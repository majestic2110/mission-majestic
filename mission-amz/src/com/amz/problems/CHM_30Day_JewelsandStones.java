package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashSet;
import java.util.Set;

public class CHM_30Day_JewelsandStones extends AbstractQuestion {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null || J.length() == 0 || S.length() == 0) {
            return 0;
        }
        Set<Character> jewels = new HashSet<>();
        for (char jewel : J.toCharArray()) {
            jewels.add(jewel);
        }
        int count = 0;
        for (char stone : S.toCharArray()) {
            if (jewels.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}
