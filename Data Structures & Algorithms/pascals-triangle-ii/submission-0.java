class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>(rowIndex+1);
        for (int i = 0; i < rowIndex+1; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++){
                List<Integer> prev = list.get(i-1);
                int num = prev.get(j) + prev.get(j-1);
                row.add(num);
            }
            if (i != 0){
                row.add(1);
            }
            list.add(row);
        }
        return list.get(rowIndex);



        
    }
}