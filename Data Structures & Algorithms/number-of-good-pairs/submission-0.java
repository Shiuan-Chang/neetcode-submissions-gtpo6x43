class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res += count.getOrDefault(nums[i], 0);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        return res;
    }
}
// nums = [1,2,3,1,1,3]
// i = 0 {1:1} i = 1 {1:1, 2:1} i = 2 {1:1, 2:1, 3:1} i = 3 {1:2, 2:1, 3:1} i = 4 {1:3, 2:1, 3:1} i = 5 {1:3, 2:1, 3:2}
// i = 0 res = 0; i = 1 res =0 ; i =2 res = 0; i = 3 res = 1; i = 4 res = 3; i = 5 res = 