class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] textCount = new int[26];
        for (char s : text.toCharArray()){
            textCount[s - 'a'] += 1;
        }
        String balloon = "balloon";
        int[] balloonCount = new int[26];
        for (char n : balloon.toCharArray()){
            balloonCount[n - 'a'] += 1;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < balloonCount.length; i++){
            if (balloonCount[i] == 0){continue;}
            int times = textCount[i] / balloonCount[i];
            res = Math.min(res,times);
        }
        return res;
    }
}