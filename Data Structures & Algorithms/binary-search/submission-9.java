class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;

        while (l <= r)
        {
            int m = (l + r) / 2;
            if (target < nums[m])
            {
                r--;
            }
            else if (target > nums[m])
            {
                l++;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
}
