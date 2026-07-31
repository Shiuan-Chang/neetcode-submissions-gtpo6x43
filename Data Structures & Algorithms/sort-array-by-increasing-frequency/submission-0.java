class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a,b) ->{
            int freqA = count.get(a);
            int freqB = count.get(b);
            if (freqA != freqB){
                return Integer.compare(freqA, freqB);
            }
            return Integer.compare(b,a);
        });
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}