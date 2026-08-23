class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> count1 = new HashSet<>();
        Set<Integer> count2 = new HashSet<>();

        for (int num1 : nums1){count1.add(num1);}
        for (int num2 : nums2){count2.add(num2);}

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (int num : count1){
            if (!count2.contains(num)){res1.add(num);}
        }

        for (int num : count2){
            if (!count1.contains(num)){res2.add(num);}
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(res1);
        ans.add(res2);
        return ans;

    }
}