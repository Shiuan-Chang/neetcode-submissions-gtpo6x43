class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        int[] allowedCount = new int[26];
        for (char w : allowed.toCharArray()){
            allowedCount[w - 'a'] += 1;
        }
        
        for (String word : words){
            int[] wordsCount = buildWordsChar(word);
            if (isConsistent(allowedCount, wordsCount) == true){
                res += 1;
            }
        }
        return res;
    }

    private int[] buildWordsChar(String word){
        int[] wordCounts = new int[26];
        for (char s : word.toCharArray()){
            wordCounts[s - 'a'] += 1;
        }
        return wordCounts;
    }

    private boolean isConsistent(int[] allowedCount, int[] wordsCount){
        for (int i = 0; i < wordsCount.length; i++){
            if (wordsCount[i] > 0 && allowedCount[i] == 0){
                return false;
            }
        }
        return true;
    }
}