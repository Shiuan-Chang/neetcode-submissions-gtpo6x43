class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        int count = k;
        for (String n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for (int i = 0; i < arr.length; i++){
            if (map.get(arr[i]) == 1){
                count--;
            }
            if (count == 0){
                return arr[i];
            }      
        }
        return "";
    }
}