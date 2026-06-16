class TimeMap {

    private Map<String, List<Integer>> timeStamps;
    private Map<String, List<String>> values;
    
    public TimeMap() {
        timeStamps = new HashMap<>();
        values = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timeStamps.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp); // timestamps = {"alice" → [1, 3]}
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value); //values = {"alice" → ["happy", "sad"]}
    }
    
    public String get(String key, int timestamp) {
        if (!timeStamps.containsKey(key)) return "";

        List<Integer> times = timeStamps.get(key);
        int lo = 0;
        int hi = times.size() - 1;
        int index = 0;
        index = -1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            
            if (timestamp >= times.get(mid)){
                index = mid;
                lo = mid + 1;
            }

            else{
                hi = mid - 1;
            }
        }
        return index == -1 ? "" : values.get(key).get(index);
    }
}