class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) -1
        while l <= r:
            m = (l+r)//2
            if nums[m] == target:
                return m
            
            if nums[l] <= nums[m]:
                if nums[l] <= target < nums[m]:
                    r = m - 1
                else:
                    l = m + 1
            
            else:
                if nums[m] < target <= nums[r]:
                    l = m + 1
                else:
                    r = m - 1
        return -1

        #l, r = 0, len(nums) - 1
        
        
        #while l <= r:
            #mid = (l + r) // 2
            
            #if nums[mid] == target:
                #return mid
            
            # 左半部有序
            
            #if nums[l] <= nums[mid]:
                #if nums[l] <= target < nums[mid]:
                    #r = mid - 1
                #else:# 如果左半部呈現無序狀況，代表目標數在右半邊
                    #l = mid + 1
            # 右半部有序            
            #else:
                #if nums[mid] < target <= nums[r]:
                    #l = mid + 1
                #else:
                    #r = mid - 1
        #return -1


                ##[3,4,5,6,1,2]

                ## target = 1 
                ## l = 0 r= 5 mid = 2
                ## nums[2]= 5 
                ## (l+5)/2= 4 l = 3 = m + 1





        
        
        
        