class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, subset, res);
        return res;
    }

    private void dfs(int[] candidates, int i, int diff, List<Integer> subset, List<List<Integer>> res){
        if (diff == 0){
            res.add(new ArrayList<>(subset));
            return;
        }
        else if (diff < 0){
            return;
        }

        for (int j = i; j < candidates.length; j++){
            if (j > i && candidates[j] == candidates[j - 1]){
                continue;
            }
            subset.add(candidates[j]);
            dfs(candidates, j+1, diff - candidates[j], subset, res);
            subset.remove(subset.size()-1);
        }
    }
}
