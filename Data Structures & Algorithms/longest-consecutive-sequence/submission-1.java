class Solution {
    //注意:每個數字自己本身都可以算成一個長度為 1 的連續序列，所以就算沒有連續的情況，至少也會回傳1
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num:nums)
        {
            numSet.add(num);
        }

        int longest = 0;
        for (int num:numSet)
        {
            if(!numSet.contains(num-1))
            {
                int length = 1;
                while(numSet.contains(num + length))
                {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
