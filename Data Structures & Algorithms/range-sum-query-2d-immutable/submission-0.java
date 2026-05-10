class NumMatrix {


// matrix:matrix =[  [1, 2, 3],  [4, 5, 6]]
// [1, 2, 3]
// [4, 5, 6]
// sumMat = [  [0, 0, 0, 0],  [0, 1, 3, 6],  [0, 5, 12, 21]]
// [0, 0, 0, 0]
// [0, 1, 3, 6]
// [0, 5, 12, 21]
private int[][] sumMat;
    public NumMatrix(int[][] matrix) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        sumMat = new int[ROWS+1][COLS+1];
        for (int r = 0; r < ROWS; r++)
        {
            int prefix = 0;
            for (int c = 0; c < COLS; c++)
            {
                prefix += matrix[r][c]; // 目前這一列，從左加到現在
                int above = sumMat[r][c+1]; //目前格子上方那些 row 的累積總和，因為 sumMat 比 matrix 多一列一欄，所以 matrix 的 (r, c) 對應到sumMat[r + 1][c + 1]，那它「上方」就是sumMat[r][c+1]
                sumMat[r+1][c+1] = prefix + above;
            }
        }        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = sumMat[row2][col2];
        int above = sumMat[row1-1][col2];
        int left = sumMat[row2][col1-1];
        int topLeft = sumMat[row1-1][col1-1];
        return bottomRight - above - left + topLeft;

        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */