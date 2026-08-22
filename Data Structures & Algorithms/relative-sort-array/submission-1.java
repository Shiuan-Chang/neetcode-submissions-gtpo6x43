class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for (int num : arr1){ max = Math.max(max, num);}

        int[] count = new int[max+1];
        for (int num : arr1){
            count[num]++;
        }

        List<Integer> res = new ArrayList<>();
        for (int num : arr2){
            while (count[num] > 0){
                res.add(num);
                count[num]--;
            }
        }

        for (int i = 0; i < count.length; i++){
            while(count[i] > 0){
                res.add(i);
                count[i]--;
            }
        }

        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            ans[i] = res.get(i);
        }

        return ans;
        
    }
}
