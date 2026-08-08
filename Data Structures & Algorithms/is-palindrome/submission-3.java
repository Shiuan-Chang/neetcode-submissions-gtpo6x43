class Solution {
    public boolean isPalindrome(String s) {
        char[] sChar = s.toCharArray();
        int l = 0;
        int r = sChar.length - 1;
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(sChar[l])){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(sChar[r])){
                r--;
            }
            if (Character.toLowerCase(sChar[l]) != Character.toLowerCase(sChar[r])){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
