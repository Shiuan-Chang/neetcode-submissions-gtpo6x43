class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            count.put(arr[i], count.getOrDefault(arr[i],0) + 1);
        }

        int maxKey = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            if (entry.getKey() == entry.getValue()){
                maxKey = Math.max(maxKey, entry.getKey());
            }
        }
        return maxKey;
        }

}