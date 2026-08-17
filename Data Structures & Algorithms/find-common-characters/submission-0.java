class Solution {
    public List<String> commonChars(String[] words) {
        int[] minCount = countChars(words[0]);
        List<String> res = new ArrayList<>();
        for (int i = 1; i < words.length; i++){
            int[] curCount = countChars(words[i]);
            for (int j = 0; j < 26; j++){
                minCount[j] = Math.min(minCount[j], curCount[j]);
            }
        }

        for (int i = 0; i < 26; i++){
            for (int j = 0; j < minCount[i]; j++){
                res.add(String.valueOf((char) (i + 'a')));
            }
        }
        return res;
    }

    private int[] countChars(String word){
        int[] charCount = new int[26];
        for (char w : word.toCharArray()){
            charCount[w - 'a']++;
        }
        return charCount;
    }
}