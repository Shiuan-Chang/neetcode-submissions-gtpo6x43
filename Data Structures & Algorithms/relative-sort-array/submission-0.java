class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        for (int num2 : arr2){
            for (int i = 0; i < arr1.length; i++){
                if (num2 == arr1[i]){
                    res.add(arr1[i]);
                    arr1[i] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for (int i = res.size(); i < arr1.length; i++){
            res.add(arr1[i]);
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;


    }
}

