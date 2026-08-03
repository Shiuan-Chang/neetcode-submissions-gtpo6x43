class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < wall.size(); i++){
            int widthSum = 0;
            for (int j = 0; j < wall.get(i).size(); j++){
                widthSum += wall.get(i).get(j);
                if (j != wall.get(i).size()-1){
                    map.put(widthSum, map.getOrDefault(widthSum, 0)+1);
                }
            }
        }

        int maxCount = 0;
        for (int count : map.values()){
            if (count > maxCount){
                maxCount = count;
            }
        }

        int res = wall.size() - maxCount;
        return res;
        
    }
}