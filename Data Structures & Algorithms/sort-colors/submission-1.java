class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            count[num] = count[num] + 1;
        }
// [1,2,1]
        int index = 0;
        for (int i = 0; i < 3; i++)
        {
            while(count[i] > 0)
            {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}