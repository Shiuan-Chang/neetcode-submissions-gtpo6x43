class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncrease = true;
        boolean isDecrease = true;
        for (int i = 0; i < nums.length-1; i++){
            if (!(nums[i] <= nums[i+1])){
                isIncrease = false;
            }
            if (!(nums[i] >= nums[i+1])){
                isDecrease = false;
            }

        }
        return isIncrease || isDecrease;
    }
}