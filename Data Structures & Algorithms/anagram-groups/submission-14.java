class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length; i++)
        {
            int[] count = new int[26];
            for (char s : strs[i].toCharArray())
            {
                count[s - 'a'] = count[s - 'a'] + 1;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(strs[i]);
        }
        return new ArrayList<>(res.values());
    }
}
