class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length + 1;
        int[] count = new int[len];
        int repeat = 0;
        int lost = 0;
        for (int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++){
            if (count[i] == 2){
                repeat = i;
            }
            if (count[i] == 0){
                lost = i;
            }
        }
        return new int[]{repeat,lost};
    }
}