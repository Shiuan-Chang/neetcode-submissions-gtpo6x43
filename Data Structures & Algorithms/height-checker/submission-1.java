class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int num : heights){
            count[num]++;
        }

        List<Integer> expected = new ArrayList<>();
        for (int i = 1; i < count.length; i++){
            int times = count[i];
            for (int j = 0; j < times; j++){
                expected.add(i);
            }        
        }

        int res = 0;
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != expected.get(i)){
                res++;
            }
        }

        return res;


    }
}