class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomCount = new int[26];
        int[] magazineCount = new int[26];

        for (char r : ransomNote.toCharArray()){
            ransomCount[r -'a'] += 1;
        }

        for (char m : magazine.toCharArray()){
            magazineCount[m - 'a'] += 1;
        }

        for (int i = 0; i < ransomCount.length; i++){
            if(ransomCount[i] > magazineCount[i]){
                return false;
            }
        }
        return true;
    }
}