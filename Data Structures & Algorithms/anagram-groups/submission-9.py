class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        result = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for word in s:
                count[ord(word) - ord('a')] += 1
            result[tuple(count)].append(s)
        return list(result.values())

        ## Use a dictionary to record the frequency of letters in each word.
        ## Key: letter frequency (e.g., a=1, c=1, t=1)
        ## Value: list of words with the same frequency (e.g., ["act"])
        ## Note: an empty string "" still maps to a valid key, so we store [""] as its value.