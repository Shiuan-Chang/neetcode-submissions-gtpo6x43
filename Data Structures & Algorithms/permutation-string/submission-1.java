class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        for (int i = 0; i < s1.length(); i++){
            countS1[s1.charAt(i)-'a']++;
            countS2[s2.charAt(i)-'a']++;
        }

        if (Arrays.equals(countS1, countS2)) return true;

        for (int r = s1.length(); r < s2.length(); r++)
        {
            countS2[s2.charAt(r)-'a']++;
            countS2 [s2.charAt(r-s1.length())-'a']--;
            if (Arrays.equals(countS1,countS2)) return true;
        }
        return false;
    }
}
