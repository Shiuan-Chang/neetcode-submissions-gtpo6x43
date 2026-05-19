class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++)
        {
            for (String str : strs)
            {
                if(i == str.length() || str.charAt(i) != firstWord.charAt(i)  )
                {
                    return firstWord.substring(0,i);

                }
            }
        }
        return firstWord;
    }
}