class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];
        for (int i = 0; i < strs[0].length(); i++)
        {
            for (String s : strs)
            {
                if ( i == s.length() || firstWord.charAt(i) != s.charAt(i))
                {
                    return firstWord.substring(0,i);
                }
            }
        }
        return firstWord;
    }
}