class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        int[] count = new int[26];
        for (int i = 0; i < count.length; i++){
            count[i] = -1;
        }

        for (int i = 0; i < s.length(); i++){
            int w = s.charAt(i) - 'a';
            if (count[w] != -1){
                res = Math.max(res, i - count[w] - 1);
            }
            else{
                count[w] = i;
            }
        }

        return res;


        
    }
}