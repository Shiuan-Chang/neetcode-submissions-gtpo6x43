class Solution {
    public int minimumIndex(List<Integer> nums) {
        int candidate = nums.get(0);
        int count = 0;

        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            if (num != candidate){
                count--;
            }
            else{count++;}
        }
        
        int totalCandidateNum = 0;
        for (int num : nums){
            if (num == candidate){
                totalCandidateNum++;
            }
        } 

        int leftCandidateNum = 0;

        for (int i = 0; i < nums.size()-1; i++){
            if (nums.get(i) == candidate){
                leftCandidateNum++;
            }
            int rightCandidateNum = totalCandidateNum - leftCandidateNum;
            if (leftCandidateNum * 2 > i + 1 &&  rightCandidateNum * 2 > nums.size()-i-1 ){
                return i ;
            }
        }
        return -1;
    }
}