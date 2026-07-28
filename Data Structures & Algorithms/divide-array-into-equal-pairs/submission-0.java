class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        for (int times : count.values()){
            if (times % 2 == 1){
                return false;
            }
        }
        return true;
    }
}