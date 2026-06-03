class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                res = Math.max(res,cnt);
                cnt = 0;
            }
            else 
            {
                cnt++;
            }
        }
        return Math.max(res,cnt);     
    }
}