class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, target, subset, res);
        return res;
    }

    private void dfs(int[] nums, int i, int diff, List<Integer> subset, List<List<Integer>> res){

        if (diff == 0){
            res.add(new ArrayList<>(subset));
            return;
        }
        else if (diff < 0){
            return;
        }
    
    for (int j = i; j < nums.length; j++) {
        subset.add(nums[j]);
        dfs(nums, j,diff - nums[j], subset, res);
        subset.remove(subset.size()-1);
    }

    
    }
}
