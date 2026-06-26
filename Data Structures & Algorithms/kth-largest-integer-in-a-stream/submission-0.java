class KthLargest {

    private int k;
    private PriorityQueue<Integer> miniHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        miniHeap = new PriorityQueue<>();
        for (int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        miniHeap.offer(val);

        if (miniHeap.size() > k){
            miniHeap.poll();
        }

        return miniHeap.peek();
    }
}
