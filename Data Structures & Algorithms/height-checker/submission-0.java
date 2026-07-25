class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] sortedHeight = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeight);
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != sortedHeight[i]){
                res++;
            }
        }
        return res;
    }
}