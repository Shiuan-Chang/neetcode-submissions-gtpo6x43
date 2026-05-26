class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store = new HashSet<>();
        for (int num : nums)
        {
            store.add(num);
        }

        int res = 0;
        for (int num : nums)
        {
            int streak = 0;
            int curr = num;

            while(store.contains(curr))
            {
                curr++;
                streak++;
            }

            res = Math.max(res,streak);
        }
        return res;
    }
}
