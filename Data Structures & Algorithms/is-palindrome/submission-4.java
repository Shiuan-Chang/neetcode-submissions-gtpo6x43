class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int l = 0;
        int r = s.length()-1;

        while (l < r){
            while (l < r && !Character.isLetterOrDigit(sArray[l])){
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(sArray[r])){
                r--;
            }
            if (Character.toLowerCase(sArray[l]) != Character.toLowerCase(sArray[r])){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
