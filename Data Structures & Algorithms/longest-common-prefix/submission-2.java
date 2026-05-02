class Solution {
    public String longestCommonPrefix(String[] strs) {
        String index = strs[0];
        for (int i = 0; i < index.length(); i++)
        {
            for (int j = 1; j < strs.length; j++)
            {
                if (i >= strs[j].length() || index.charAt(i) != strs[j].charAt(i))
                {
                    return index.substring(0,i);
                }
            }
        }
        return index;
    }
}