public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var valueToIndex = new Dictionary<int, int>();
        int index = 0;

        foreach (var num in nums) {
            int complement = target - num;

            if (valueToIndex.ContainsKey(complement)) {
                return new int[] { valueToIndex[complement], index };
            }

            // 為避免重複鍵，僅當尚未加入過才加入
            if (!valueToIndex.ContainsKey(num)) {
                valueToIndex[num] = index;
            }

            index++;
        }

        return null; // 題目保證一定有解
    }
}