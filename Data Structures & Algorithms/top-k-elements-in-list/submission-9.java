class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // {1,2,2,3,3}
        // create the map: num(key) -> frequency(value) {1:1,2:2,3:2}
        // create an array to record the frequency of each number: [[""],[1],[2,3]] index: frequecy, index[i] = num
        // get frequency from the map to the array 
        
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int num : nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>[] frequency = new List[nums.length+1];
        for (int i = 0; i < frequency.length; i++)
        {
            frequency[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer,Integer> entry : count.entrySet())
        {
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;

        for (int i = frequency.length -1; i > 0; i--)
        {
            for(int num : frequency[i])
            {
                ans[index] = num;
                index = index + 1;
                if (index == k)
                {
                    return ans;
                }
            }
        }
        return ans;
    }
}
