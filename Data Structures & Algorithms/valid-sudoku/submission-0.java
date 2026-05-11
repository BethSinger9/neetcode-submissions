class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 1. Array size 9
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] sq = new int[9];

        for (int r = 0; r < 9; r++)     // Iterating through rows
        {
            for (int c = 0; c < 9; c++)
            {
                if (board[r][c] == '.') continue;       // Skipping squares without ints

                int value = board[r][c] - '1';      //  Convert digit to a bit index

                if ((rows[r] & 1 << value) > 0 || (cols[c] & (1 << value)) > 0 ||
                (sq[(r / 3) * 3 + (c / 3)] & (1 << value)) > 0)     // Compute "mask" = 1 << value
                // Mask: data used for bitwise operation
                {
                    return false;
                }

                rows[r] |= (1 << value);
                cols[c] |= (1 << value);
                sq[(r / 3) * 3 + (c / 3)] |= (1 << value);
            }
        }

        return true;
         
    }
}
