class Solution {
    public int maxDifference(String s) {
        int[] count = new int[26];
        for (char n : s.toCharArray()){
            count[n - 'a'] += 1;
        }
        int oddValue = 1;
        int evenValue = Integer.MAX_VALUE;

        for (int i = 0; i < count.length; i++){
            if (count[i] == 0) continue;
            if (count[i] % 2 == 1){
                oddValue = Math.max(oddValue, count[i]);
            }

            if (count[i] % 2 == 0){
                evenValue = Math.min(evenValue, count[i]);
            }
        }

        int diff = oddValue - evenValue;
        return diff;
    }
}