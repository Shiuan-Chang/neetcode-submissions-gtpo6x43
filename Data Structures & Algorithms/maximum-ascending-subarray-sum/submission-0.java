class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0;
        boolean isIncreasing = false;
        for (int i = 0; i < nums.length; i++){
            int currAns = nums[i];
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] > nums[j-1]){
                    currAns += nums[j];
                    isIncreasing = true;
                }
                else {
                    isIncreasing = false;
                    break;
                }
            }
            ans = Math.max(ans, currAns);
        }
        return ans;
    }
}