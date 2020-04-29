package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CHZ_30Day_FirstUniqueNumber extends AbstractQuestion {
    class FirstUnique {
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> all = new HashSet<>();

        public FirstUnique(int[] nums) {
            if (nums != null && nums.length != 0) {
                for (int num : nums) {
                    addElement(num);
                }
            }
        }

        private void addElement(int val) {
            if (all.contains(val)) {
                unique.remove(val);
            } else {
                unique.add(val);
                all.add(val);
            }
        }

        public int showFirstUnique() {
            if (unique.isEmpty()) {
                return -1;
            }
            Iterator<Integer> itr = unique.iterator();
            return itr.next();
        }

        public void add(int value) {
            addElement(value);
        }
    }

    @Override
    public void simulate() {
    }
}
