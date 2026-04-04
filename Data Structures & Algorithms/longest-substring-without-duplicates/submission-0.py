class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        mp = {}
        l = 0
        res = 0

        for r in range(len(s)):
            if s[r] in mp:
                l = max(mp[s[r]]+1,l) #保證左指標前進，取max原因是假設abba，直接取mp[s[r]]+1左指標會往前跑
            mp[s[r]] = r
            res = max(res,r-l+1)
        return res
        