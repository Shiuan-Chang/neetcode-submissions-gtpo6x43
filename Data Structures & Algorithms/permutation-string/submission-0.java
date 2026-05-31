class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // 初始化 s1 的頻率 和 s2 第一個視窗的頻率
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) return true;

        // 滑動視窗，固定大小 s1.length()
        for (int r = s1.length(); r < s2.length(); r++) {
            count2[s2.charAt(r) - 'a']++;               // 加入右邊新字元
            count2[s2.charAt(r - s1.length()) - 'a']--; // 移除左邊舊字元
            if (Arrays.equals(count1, count2)) return true;
        }
        return false;
    
    }
}
