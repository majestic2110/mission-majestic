package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashMap;
import java.util.Map;

public class IP_G_LongestSubstringWithoutRepeatingCharacters extends AbstractQuestion {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        int end = 0;
        for (end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            maxLen = Math.max(maxLen, end - start + 1);
            map.put(s.charAt(end), end);
        }
        return maxLen;
    }

    @Override
    public void simulate() {
        IP_G_LongestSubstringWithoutRepeatingCharacters test = new IP_G_LongestSubstringWithoutRepeatingCharacters();
        String str = "abcbbshdge";
        System.out.println("Length of the longest substring := " + test.lengthOfLongestSubstring(str));
    }
}
