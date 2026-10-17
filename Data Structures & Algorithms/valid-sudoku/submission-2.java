class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++){
                if (board[row][i] == '.') continue;
                if (seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }

        for (int column = 0; column < 9; column++){
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++){
                if (board[i][column] == '.') continue;
                if (seen.contains(board[i][column])) return false;
                seen.add(board[i][column]);
            }
        }

        for (int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    int row = (square / 3) * 3 + i; // 因為 / 3 只告訴你「第幾排宮」（0、1、2），但盤面上每一排宮佔 3 列格子，所以要乘 3 才能換成「實際的列號」。
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
