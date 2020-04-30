package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.*;

public class CHZ_30Day_GroupAnagrams extends AbstractQuestion {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        List<List<String>> resList = new ArrayList<>();
        Map<String, List<String>> mapStrs = new HashMap<>();
        int[] map;
        for (String item : strs) {
            map = new int[26];
            for (char ch : item.toCharArray()) {
                map[ch - 'a']++;
            }
            // can be replaced by sort, or any other encoding method
            String key = Arrays.toString(map);
            List<String> temp = mapStrs.getOrDefault(key, new ArrayList<>());
            temp.add(item);
            mapStrs.put(key, temp);
        }
        for (String key : mapStrs.keySet()) {
            resList.add(mapStrs.get(key));
        }
        return resList;
    }

}
