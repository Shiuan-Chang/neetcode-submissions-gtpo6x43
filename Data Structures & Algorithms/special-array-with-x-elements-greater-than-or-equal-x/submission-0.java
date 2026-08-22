class Solution {
    public int specialArray(int[] nums) {

        int res = -1;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length + 1; i++){
            int numbers = 0;
            for (int num : nums){
                if(i <= num){
                    numbers++;
                    count.put(i, numbers);
                }
            }
        }

        for (int x : count.keySet()){
            if (x == count.get(x)){
                res = x;
            }
        }
        return res;
        
    }
}