class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;
        boolean isOdd = false;
        for(char w : s.toCharArray()){
            count.put(w, count.getOrDefault(w,0)+1);
        }

        for (int num : count.values()){
            if (num % 2 == 0){
                res += num;
            }
            if (num == 1 && isOdd == false){
                res += 1;
                isOdd = true;
            }
            if (num > 1 && num % 2 == 1){
                int quotient = num / 2;
                res += quotient * 2;
                if (isOdd == false){
                     res++;
                     isOdd = true;
                }
            }
        }
        return res;  
    }
}