class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);

        for (int i = 0; i < nums.length + 1; i++){
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        // [[],[1,3],[2,4]]

        List<Integer> res = new ArrayList<>(k);
        int index = 0;
        outer:
        for (int i = buckets.size()-1; i >= 0 ; i--){
            for (int num : buckets.get(i)){
                res.add(num);
                index++;
                if (index == k){
                    break outer;
                }
            }
        }

        int[] transRes = new int[k];

        for (int i= 0; i < res.size(); i++){
            transRes[i] = res.get(i);
        }

        return transRes;


    }
}
