package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

public class CHZ_30Day_NumberofIslands extends AbstractQuestion {
    int maxRow;
    int maxCol;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        this.maxRow = grid.length;
        this.maxCol = grid[0].length;
        int count = 0;
        for (int row = 0; row < this.maxRow; row++) {
            for (int col = 0; col < this.maxCol; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    destroyIsland(grid, row, col);
                }
            }
        }
        return count;
    }

    private void destroyIsland(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= this.maxRow || col >= this.maxCol || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        destroyIsland(grid, row + 1, col);
        destroyIsland(grid, row - 1, col);
        destroyIsland(grid, row, col + 1);
        destroyIsland(grid, row, col - 1);
    }

    @Override
    @Test
    public void evaluate() {
        CHZ_30Day_NumberofIslands test = new CHZ_30Day_NumberofIslands();
        char[][] grid = {{'0', '1', '0', '1'}};
        System.out.println("No. of islands := " + test.numIslands(grid));
    }
}
