class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < nums.length+1; i++){
            bucket.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> c : count.entrySet()){
            int number = c.getKey();
            int freq = c.getValue();
            bucket.get(freq).add(number);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.size() -1; i > 0 && index < k; i--){
            for (int n : bucket.get(i)){
                res[index] = n;
                index++;
                if ( index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
