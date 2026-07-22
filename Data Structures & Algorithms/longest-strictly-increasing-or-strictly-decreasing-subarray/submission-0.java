class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 0;
        boolean isIncreasing = false;
        for (int i = 0; i < nums.length; i++){
            int curCount = 1;
            for (int j = i + 1; j < nums.length; j++){
                if (j == i + 1){
                    if (nums[j] > nums[j-1]){
                        isIncreasing = true;
                        curCount++;}
                    else if (nums[j] < nums[j-1]){
                        isIncreasing = false;
                        curCount++;}
                    else {break;}
                }
                else{
                    if (nums[j] > nums[j-1] && isIncreasing == true){
                        curCount++;
                    }
                    else if (nums[j] > nums[j-1] && isIncreasing == false){
                        break;
                    }

                    else if (nums[j] < nums[j-1] && isIncreasing == true){
                        break;
                    }
                    else if (nums[j] < nums[j-1] && isIncreasing == false){
                        curCount++;}
                    else {break;}
                }
            }
            count = Math.max(curCount, count);
        }
        return count;
    }
}