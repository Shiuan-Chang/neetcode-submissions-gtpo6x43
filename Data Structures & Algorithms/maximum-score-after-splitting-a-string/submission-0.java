class Solution {
    public int maxScore(String s) {
        // maximize leftzero - leftone then add total one
        int zero = 0;
        int one = 0;
        int res = Integer.MIN_VALUE;

        if (s.charAt(0) == '0'){
            zero++;
        }
        else{one++;}

        for (int i = 1; i < s.length(); i++){
            res = Math.max(res, zero - one);
            if (s.charAt(i) == '0'){
                zero++;
            }
            else{
                one++;
            }
        }
        return res + one;
    }
}