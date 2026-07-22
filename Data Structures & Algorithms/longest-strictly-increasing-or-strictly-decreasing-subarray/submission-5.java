class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int increaseLen = 1;
        int decreaseLen = 1;

        for (int i = 1; i < nums.length; i++){
            int maxCount = 1;
            if (nums[i] > nums[i - 1]){
                increaseLen++;
                decreaseLen = 1;
            }
            else if (nums[i] < nums[i - 1]){
                decreaseLen++;
                increaseLen = 1;
            }
            else{
                increaseLen = 1;
                decreaseLen = 1;
            }
            maxCount = Math.max(increaseLen, decreaseLen);
            count = Math.max(count, maxCount);
        }
        
        return count;
    }
}