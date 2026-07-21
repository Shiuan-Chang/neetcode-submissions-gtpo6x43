class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++){
            res[i] = -1;
        }
        Map<Integer, Integer> num1Index = new HashMap<>();
        for (int i = 0; i < nums1.length; i++){
            num1Index.put(nums1[i], i);
        }

        Stack<Integer> stack = new Stack<>();
        for (int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                int val = stack.pop();
                int idx = num1Index.get(val);
                res[idx] = num;
            }

            if (num1Index.containsKey(num)){
                stack.push(num);
            }
        }
        return res;
    }
}