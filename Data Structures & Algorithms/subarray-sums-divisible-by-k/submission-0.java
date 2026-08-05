class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            int totalSum = 0;
            for (int j = i; j < nums.length; j++){
                totalSum += nums[j];
                if (totalSum % k == 0){
                    res += 1;
                }
            }
        }
        return res;
    }
}