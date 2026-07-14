class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> prev = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(prev.containsKey(diff)){
                res[0] = prev.get(diff);
                res[1] = i;
                return res;
            }
            prev.put(nums[i],i);
        }
        return new int[]{};
    }
}
