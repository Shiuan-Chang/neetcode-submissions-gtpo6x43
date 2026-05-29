class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

// Input: nums = [1,2,3,4,5,6,7,8], k = 4
// Output: [5,6,7,8,1,2,3,4]
    private void reverse(int[] nums, int l, int r)
    {
        while(l < r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--; 
        }
    }
}