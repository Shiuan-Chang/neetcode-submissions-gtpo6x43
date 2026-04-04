class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left, right = 1, max(piles)

        while left < right:
            mid = (left + right) // 2
            hours = sum((p + mid - 1) // mid for p in piles)
            if hours <= h:
                right = mid
            else:
                left = mid + 1
        return left












        # check and add the numbers to check whether they are < h
        #since we need to keep the speed at k, and if the numbers of banana of the pile < k 
        # we have to wait in the same hour and can not eat another pile
        # food / time = rate => time = food / rate
        # each number must take the ceil value, like 1/2 = 1 3/2 =2...
        # speed = 1 
            ## if sum(nums)  < h speed =1
            ## elif sum(nums) > h speed +=1 
        # single > h
           # max single

        #Input: piles = [1,4,3,2], h = 9 Output: 2
        #Input: piles = [25,10,23,4], h = 4 Output: 25


        