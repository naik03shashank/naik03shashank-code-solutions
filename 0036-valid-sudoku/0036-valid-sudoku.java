import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // Check row
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }

                // Check column
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
            }
        }

        // Check 3x3 boxes
        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {

                HashSet<Character> boxSet = new HashSet<>();

                for (int i = blockRow * 3; i < blockRow * 3 + 3; i++) {
                    for (int j = blockCol * 3; j < blockCol * 3 + 3; j++) {

                        if (board[i][j] != '.') {
                            if (boxSet.contains(board[i][j])) {
                                return false;
                            }
                            boxSet.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}