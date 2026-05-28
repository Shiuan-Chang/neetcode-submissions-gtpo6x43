class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < word1Len || i < word2Len; i++)
        {
            if (i < word1Len)
            {
                res.append(word1.charAt(i));
            }

            if (i < word2Len)
            {
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}