class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums1){
            seen.add(num);
        }

        List<Integer> sameNum = new ArrayList<>();
        for (int num : nums2){
            if (seen.contains(num)){
                sameNum.add(num);
                seen.remove(num);
            }
        }

        int n = sameNum.size();
        int[] res = new int[n];
        for (int i = 0; i < sameNum.size(); i++){
            res[i] = sameNum.get(i);
        }
        return res;
    }
}