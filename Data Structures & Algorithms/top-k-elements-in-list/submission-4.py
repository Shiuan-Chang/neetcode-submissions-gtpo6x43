class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = []
        for i in range(len(nums)+1): ## exclude 0 index
            freq.append([])       
        for num in nums:
            count[num] = 1 + count.get(num,0) ## number:freq
        for i, n in  count.items(): ## [number] index = freq
            freq[n].append(i)
        
        result = []
        for i in range(len(freq)-1, 0, -1):
            for num in freq[i]:
                result.append(num)
                if len(result) == k:
                    return result


        

