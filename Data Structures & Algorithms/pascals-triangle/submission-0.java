class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int len = i; 
            for (int j = 1; j < len; j++){
                List<Integer> prev = res.get(i-1);
                int num = prev.get(j-1) + prev.get(j);
                row.add(num);
            }

            if (i != 0){
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}