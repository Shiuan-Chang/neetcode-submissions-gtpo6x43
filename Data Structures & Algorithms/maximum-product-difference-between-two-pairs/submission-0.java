class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int res = nums[length-1] * nums[length-2] - nums[0] * nums[1];
        return res;
    }
}