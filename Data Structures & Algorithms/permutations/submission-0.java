class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> subset, boolean[] pick){
        if (subset.size() == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (!pick[i]){
                subset.add(nums[i]);
                pick[i] = true;
                backtrack(nums, subset, pick);
                subset.remove(subset.size()-1);
                pick[i] = false;
            }
        }
    }
}
