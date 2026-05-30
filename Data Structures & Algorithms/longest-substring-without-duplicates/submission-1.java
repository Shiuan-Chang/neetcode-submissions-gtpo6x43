class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0; 
        int res = 0;

        for (int r = 0; r < s.length(); r++)
        {
            if(count.containsKey(s.charAt(r)))
            {
                l = Math.max(count.get(s.charAt(r))+1,l);
            }
            count.put(s.charAt(r),r);
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
