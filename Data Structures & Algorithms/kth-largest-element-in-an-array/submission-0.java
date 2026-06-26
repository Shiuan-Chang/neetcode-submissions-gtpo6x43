class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> miniHeap = new PriorityQueue<>();

        for (int num : nums){
            miniHeap.offer(num);
            if (miniHeap.size() > k){
                miniHeap.poll();
            }
        }
        return miniHeap.peek();
    }
}
