class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int n : nums)
        {
            count.put(n,count.getOrDefault(n,0)+1);
        }

        int[] numList = new int[]{0,1,2};
        int index = 0;
        for (int i = 0; i < numList.length; i++)
        {
            int color = numList[i];

            while(count.getOrDefault(color,0) > 0)
            {
                nums[index] = color;
                index++;
                count.put(color, count.get(color)-1);
            }
        }
    }
}