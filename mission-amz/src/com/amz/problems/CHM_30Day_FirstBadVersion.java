package com.amz.problems;

import com.amz.common.AbstractQuestion;

class VersionControl extends AbstractQuestion {
    boolean isBadVersion(int version) {
        return false;
    }
}

public class CHM_30Day_FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int hi = n;
        int lo = 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
