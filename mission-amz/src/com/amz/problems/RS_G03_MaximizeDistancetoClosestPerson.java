package com.amz.problems;

import com.amz.common.AbstractQuestion;

public class RS_G03_MaximizeDistancetoClosestPerson extends AbstractQuestion {

    public int maxDistToClosest(int[] seats) {
        if (seats == null || seats.length == 0) {
            return 0;
        }
        int start = -1;
        int maxLen = 0;
        int n = seats.length;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                continue;
            }
            if (start == -1) {
                maxLen = Math.max(maxLen, i);
            } else {
                maxLen = Math.max(maxLen, (i - start) / 2);
            }
            start = i;
        }

        if (seats[n - 1] == 0) {
            maxLen = Math.max(maxLen, n - 1 - start);
        }
        return maxLen;
    }

    @Override
    public void simulate() {
        RS_G03_MaximizeDistancetoClosestPerson test = new RS_G03_MaximizeDistancetoClosestPerson();
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        System.out.println("Max Distance := " + test.maxDistToClosest(seats));
    }
}
