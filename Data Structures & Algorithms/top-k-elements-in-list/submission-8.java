class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        // Step 1:
        // Create a HashMap to record the frequency of each number.
        // key: number, value: frequency
        // Create a frequency bucket where the index represents the frequency.
        // freq[i] stores all numbers that appear i times.
        // 我要用誰來查資料，誰就當 key；我要查到的結果，誰就當 value => 計算每個數字出現幾次，用「數字」去查「次數」。

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1]; // +1 主要是因為 frequency 可能等於 nums.length

        // 這段是在幫 freq 陣列的每個位置準備一個空 List，避免後面 add 時發生 null error。

        for (int i = 0; i < freq.length; i++)
        {
            freq[i] = new ArrayList<>();
        }

        // Step 2:
        // Iterate through the HashMap.
        // For each entry, get the number and its frequency.
        // Put the number into the corresponding bucket: freq[frequency].

        for (int num:nums)
        {
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) //Entry 通常是用在：你想同時拿到 HashMap 裡面的 key 和 value
        {
            freq[entry.getValue()].add(entry.getKey());
        }

        // Step 3:
        // Iterate through freq from the back to the front.
        // Collect numbers from higher frequency to lower frequency.
        // Stop when we have collected k numbers.

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--)
        {
            for (int n : freq[i])
            {
                res[index] = n;
                index++;
                if (index == k)
                {
                    return res;
                }
            }
        }
            return res;
    }

}
