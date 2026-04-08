class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = [[] for i in range(len(nums)+1)]

        for num in nums:
            count[num] = 1 + count.get(num,0)

        for number, cnt in count.items():
            freq[cnt].append(number)
        
        result = []
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:## 有可能出現頻率一樣多的數字，像[,3,[1,2]]，這層迴圈就是把[1,2]抓出來
                result.append(num)
                if len(result) == k:
                    return result
