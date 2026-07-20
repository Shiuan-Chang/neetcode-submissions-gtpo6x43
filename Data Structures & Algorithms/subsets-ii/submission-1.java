class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, res, 0, subset, new boolean[nums.length]);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, int start, List<Integer> subset, boolean[] used){

        res.add(new ArrayList<>(subset));


        for (int i = start; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

                subset.add(nums[i]);
                used[i] = true;
                backtrack(nums, res, i + 1, subset, used);
                subset.remove(subset.size()-1);
                used[i] = false;
             
        }
    }
}
