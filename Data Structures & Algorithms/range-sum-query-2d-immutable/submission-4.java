class NumMatrix {

    private int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int Rows = matrix.length;
        int Cols = matrix[0].length;
        sumMatrix = new int[Rows+1][Cols+1];

        for (int r = 0; r < Rows; r++)
        {
            int prefix = 0;
            for(int c = 0; c < Cols; c++)
            {
                prefix += matrix[r][c];
                int above = sumMatrix[r][c+1];
                sumMatrix[r+1][c+1] = prefix + above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int buttomRight = sumMatrix[row2][col2];
        int above = sumMatrix[row1-1][col2];
        int left = sumMatrix[row2][col1-1];
        int topLeft = sumMatrix[row1-1][col1-1];
        return buttomRight - above - left + topLeft; 
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */