class Solution {
    public int arraySign(int[] nums) {
        int res;
        int negCount = 0;
        for (int num : nums){
            if (num == 0){
                return res = 0;
            }
            else if (num < 0){
                negCount++;
            }
        }

        if (negCount % 2 == 1){
            return res = -1;
        }
        else{
            return res = 1;
        }
    }
}