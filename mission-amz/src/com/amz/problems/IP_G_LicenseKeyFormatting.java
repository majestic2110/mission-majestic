package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class IP_G_LicenseKeyFormatting extends AbstractQuestion {
    public String licenseKeyFormatting(String S, int K) {
        if (S == null || S.length() == 0) {
            return S;
        }
        StringBuilder buff = new StringBuilder();
        int curLen = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '-') {
                continue;
            }
            if (curLen == K) {
                curLen = 0;
                buff.append("-");
            }
            buff.append(Character.toUpperCase(S.charAt(i)));
            curLen++;
        }
        return buff.reverse().toString();
    }

}
