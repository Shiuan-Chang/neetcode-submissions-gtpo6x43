class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap -> prefixSum : freq
        // int prefix = 0; int count = 0;

        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        int prefix = 0;
        int count = 0;
        prefixSums.put(0,1);

        for (int num : nums)
        {
            prefix += num;
            int diff = prefix - k;
            count += prefixSums.getOrDefault(diff,0);
            prefixSums.put(prefix,prefixSums.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}