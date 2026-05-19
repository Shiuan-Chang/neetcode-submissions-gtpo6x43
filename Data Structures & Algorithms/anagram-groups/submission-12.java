class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for (int i = 0; i < strs.length; i++)
        {
            int[] count = new int[26];
            for (char s : strs[i].toCharArray()) // Java 不能直接用 enhanced for loop 跑 String
            {
                count[s - 'a'] = count[s - 'a'] + 1;
            }
            String key = Arrays.toString(count);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }

        return new ArrayList<>(ans.values());
    }
}
