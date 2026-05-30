class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        // 有重複的數字代表有出現過
        // 邊界:要是set裡面出現的數字，數目>k，則刪除最舊的那個，代表他已經不合適了
        // l = 0; r= 0 以r做迴圈開始

        int l = 0;

        for (int r = 0; r < nums.length; r++)
        {
            if (r - l > k)
            {
                window.remove(nums[l]);
                l++;
            }
            
            if (window.contains(nums[r]))
            {
                return true;
            }
            
            window.add(nums[r]);
        }
        return false;
    }
}