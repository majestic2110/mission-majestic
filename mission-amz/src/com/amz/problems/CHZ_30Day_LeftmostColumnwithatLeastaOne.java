package com.amz.problems;

import com.amz.common.AbstractQuestion;

import java.util.List;

public class CHZ_30Day_LeftmostColumnwithatLeastaOne extends AbstractQuestion {

    interface BinaryMatrix {
        public int get(int x, int y);

        public List<Integer> dimensions();
    }

    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        if (binaryMatrix == null) {
            return 0;
        }
        List<Integer> dims = binaryMatrix.dimensions();
        int colN = -1;
        int row = 0;
        int col = dims.get(1) - 1;
        while (row < dims.get(0) && col >= 0) {
            if (binaryMatrix.get(row, col) == 1) {
                colN = col;
                col--;
            } else {
                row++;
            }
        }
        return colN;
    }

    @Override
    public void simulate() {
        // to be done
    }
}
