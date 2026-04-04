public class Solution
{
    public int[] TwoSum(int[] nums, int target) 
    {
        Dictionary<int,int> indices = new Dictionary<int,int>();

        for(int i = 0; i < nums.Length; i++)
        {
            indices[nums[i]] = i ;
        }

        for(int i = 0; i < nums.Length; i++)
        {
            int difference = target - nums[i];
            if (indices.ContainsKey(difference) && indices[difference]!= i)
            {
                return new int[]{i,indices[difference]};
            }
        }
        return new int[0];

    }
}
