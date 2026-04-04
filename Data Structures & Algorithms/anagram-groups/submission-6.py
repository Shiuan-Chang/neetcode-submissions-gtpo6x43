class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = defaultdict(list)
        for word in strs:
            word_count = [0]*26
            for w in word:
                word_count[ord(w)-ord('a')] += 1
            result[tuple(word_count)].append(word)
        return list(result.values())
