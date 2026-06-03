class Solution {
    public int lengthOfLastWord(String s) {
        int r = s.length() - 1;
        int length = 0;
        while (s.charAt(r) == ' ')
        {
            r--;
        }

        while (r >= 0 && s.charAt(r) != ' ')
        {
            r--;
            length++;
        }
        return length;
    }
}