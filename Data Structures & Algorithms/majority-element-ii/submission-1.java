class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        // find the candidates
        // -> no candidate(num1 = candidate1)
        // -> have same candidate (count +1)
        // -> one more different candidate than the other two (count1-- count--)
        for (int num : nums)
        {
            if (candidate1 == num)
            {
                count1++;
            }
            else if (candidate2 == num)
            {
                count2++;
            }
            else if (count1 == 0)
            {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0)
            {
                candidate2 = num;
                count2 = 1;
            }
            else
            {
                count1 --;
                count2 --;
            }
        }
        count1 = 0;
        count2 = 0;
    
        for (int num : nums)
        {
            if (candidate1 == num){count1++;}
            else if (candidate2 == num){count2++;}
        }

        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if (count1 > n/3){res.add(candidate1);}
        if (count2 > n/3){res.add(candidate2);}

        return res;
       
    }
    
}