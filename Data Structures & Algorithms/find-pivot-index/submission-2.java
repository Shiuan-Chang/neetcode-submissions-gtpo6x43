class Solution {
    public int pivotIndex(int[] nums) {
        int res = 0;
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        for (int j = 0; j < nums.length; j++){
            int rightSum = totalSum - leftSum - nums[j];
            if (rightSum == leftSum){
                res = j;
                return res;
            }
            leftSum += nums[j];
        }
        return -1;
    }
}