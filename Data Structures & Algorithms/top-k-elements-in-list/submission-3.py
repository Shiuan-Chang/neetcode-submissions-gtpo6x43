class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = []
        for i in range(len(nums)+1):
            freq.append([])
        for num in nums:
            count[num] = 1 + count.get(num,0)
        for num,cnt in count.items():
            freq[cnt].append(num)
        result = []
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                result.append(num)
                if len(result) == k:
                    return result
    ## build a dictionary to record the frequency of each number e.g. {1: 3, 2: 2, 3: 1}
    ## use a list where the index represents frequency, and each slot holds numbers with that frequency
    ## iterate from back to front to collect the k most frequent numbers
    # freq has len(nums)+1 slots because the maximum frequency of any number cannot exceed len(nums)
    