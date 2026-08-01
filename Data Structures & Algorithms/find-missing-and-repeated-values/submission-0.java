class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                count.put(grid[i][j], count.getOrDefault(grid[i][j],0)+1);
            }
        }
        int doubleVal = 0;
        int missing = 0;
        for (int num = 1; num <= grid.length *  grid.length; num++){
            int freq = count.getOrDefault(num,0);
            if (freq == 0){missing = num;}
            if (freq == 2 ){doubleVal = num;}
        }
        return new int[]{doubleVal, missing};
    }
}