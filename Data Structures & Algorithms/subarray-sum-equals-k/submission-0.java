class Solution {
    public int subarraySum(int[] nums, int k) {
// The HashMap stores the frequency of each prefix sum.
// For each current prefix sum, calculate diff = curSum - k.
// If diff exists in the HashMap, it means some previous prefix sums can form
// subarrays ending at the current index with sum equal to k.
// Add the frequency of diff to the result.
// Then update the frequency of the current prefix sum.
//HashMap 存的是每個 prefix sum 出現過幾次。
// 每次計算目前的 curSum 後，用 curSum - k 找出需要的 previous prefix sum。
// 如果這個 previous prefix sum 出現過，就代表有幾個 subarray 可以以目前位置結尾，且總和等於 k。
// 所以把它出現的次數加到 res。
// 最後再把目前的 curSum 記錄進 HashMap。
        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        for (int num : nums)
        {
            curSum += num;
            int diff = curSum - k;
            res += prefixSum.getOrDefault(diff,0);
            prefixSum.put(curSum,prefixSum.getOrDefault(curSum,0) + 1);
        }
        return res;
    }
}