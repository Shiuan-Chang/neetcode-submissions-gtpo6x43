class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Len = word1.length();
        int w2Len = word2.length();
        int w1L = 0;
        int w2L = 0;
        StringBuilder res = new StringBuilder();

        while (w1L < w1Len || w2L < w2Len){
            if (w1L < w1Len){
                res.append(word1.charAt(w1L));
                w1L++;
            }
            if (w2L < w2Len){
                res.append(word2.charAt(w2L));
                w2L++;
            }
        }
        return res.toString();
    }
}