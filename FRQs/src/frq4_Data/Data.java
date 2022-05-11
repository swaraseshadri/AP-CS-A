package frq4_Data;

import java.util.ArrayList;

/**
 * Class Data is part of Question 4 from the FRQs in the
 * 2022 AP Computer Science A exam.
 * Problem definition from page 14 in:
 * https://apcentral.collegeboard.org/pdf/ap22-frq-computer-science-a.pdf
 */
public class Data {

    public static final int MAX = 1000; /* value provided as example */
    private int[][] grid;
    
    /** Fills all elements of grid with randomly generated values,
     * as described in part (a)
     * Precondition: grid is not null.
     *     grid has at least one element.
     */
    public void repopulate() {
        /* to be implemented in part (a) */
        
        // given MAX, we have as many choices as multiple of 10s are in the range [1..MAX]
        // from which we need to exclude the multiple of 100.
        int nChoices = MAX/10 - MAX/100;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // pick a random choice in the range [1..nChoices]
                int choice = (int)(1 + nChoices * Math.random());
                // Generate the random number verifying all constraints:
                //
                // choice:            1  2 ...  9  10  11 ...  18  19 ...  27  28 ...  
                // choice*10:        10 20 ... 90 100 110 ... 180 190 ... 270 280 ...
                // offset:            0  0 ...  0  10  10 ...  10  20 ...  20  30 ...
                // choice*10+offset: 10 20 ... 90 110 120 ... 190 210 ... 290 310 ...
                //
                // Offset starts from 0 and with every group of 9 choices it grows by 10 
                // => offset = 10 * (choice-1) / 9
                grid[i][j] = 10 * choice + 10 * (choice - 1) / 9;
            }
        }
    }

    /** Returns the number of columns in grid that are in increasing order,
     * as described in part (b)
     * Precondition: grid is not null.
     *    grid has at least one element.
     */
    public int countIncreasingCols() {
        /* to be implemented in part (b) */
        int count = 0;
        
        for (int c = 0; c < grid[0].length; c++) {
            boolean increasing = true;
            for (int r = 1; increasing && r < grid.length; r++) {
                increasing = (grid[r-1][c] <= grid[r][c]);
            }
            if (increasing) {
                count++;
            }
        }
        
        return count;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.

}
