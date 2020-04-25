package com.amz.problems;

import com.amz.common.AbstractQuestion;

import static org.junit.Assert.assertTrue;

public class CHZ_30Day_BackspaceStringCompare extends AbstractQuestion {
    public boolean backspaceCompare(String S, String T) {
        if (S == null || T == null) {
            return S == T;
        }
        StringBuilder buff1 = new StringBuilder();
        StringBuilder buff2 = new StringBuilder();
        update(S, buff1);
        update(T, buff2);
        return buff1.toString().equals(buff2.toString());
    }

    private void update(String s, StringBuilder buff) {
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (buff.length() > 0) {
                    buff.deleteCharAt(buff.length() - 1);
                }
            } else {
                buff.append(ch);
            }
        }
    }

    /**
     * Back space compare without extra space
     *
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompareII(String S, String T) {
        int si = S.length() - 1;
        int ti = T.length() - 1;
        int scount = 0;
        int tcount = 0;
        while (si >= 0 || ti >= 0) {
            int[] arr = getValid(S, scount, si);
            scount = arr[0];
            si = arr[1];
            arr = getValid(T, tcount, ti);
            tcount = arr[0];
            ti = arr[1];
            if (si >= 0 && ti >= 0 && S.charAt(si) == T.charAt(ti)) {
                si--;
                ti--;
            } else {
                return si == -1 && ti == -1;
            }
        }
        return true;
    }

    private int[] getValid(String str, int count, int index) {
        while (index >= 0 && (str.charAt(index) == '#' || count > 0)) {
            if (str.charAt(index) == '#') {
                count++;
            } else {
                count--;
            }
            index--;
        }
        return new int[]{count, index};
    }

    @Override
    public void simulate() {
        CHZ_30Day_BackspaceStringCompare test = new CHZ_30Day_BackspaceStringCompare();
        String s1 = "a#b#c";
        String s2 = "cbn##";
        assertTrue(test.backspaceCompare(s1, s2));
        assertTrue(test.backspaceCompareII(s1, s2));
    }
}
