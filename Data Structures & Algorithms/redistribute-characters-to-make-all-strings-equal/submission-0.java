class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int flag = 0;
        int[] count = new int[26];

        for (String word : words){
            for (char w : word.toCharArray()){
                count[w - 'a']++;
            }
        }

        for (int i = 0; i < count.length; i++){
            if (count[i] % n != 0){
                return false;
            }
        }
        return true;
    }
}