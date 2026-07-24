class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            res.add(i+1);
        }
        for (int i = 0; i < nums.length; i++){
            if (res.contains(nums[i])){
                res.remove(Integer.valueOf(nums[i]));
            }
        }
        return res;
    }
}