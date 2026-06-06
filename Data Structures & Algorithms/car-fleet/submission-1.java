class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;
    
    // 1. 打包
    int[][] cars = new int[n][2];
    for (int i = 0; i < n; i++) {
        cars[i][0] = position[i];
        cars[i][1] = speed[i];
    }
    
    // 2. 按位置由大到小排序
    Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
    
    // 3. Stack 邏輯
    Stack<Double> stack = new Stack<>();
    for (int[] p : cars) {
        double time = (double)(target - p[0]) / p[1];
        if (stack.isEmpty() || time > stack.peek()) {
            stack.push(time);
        }
    }
    
    // 4. Stack 大小就是 fleet 數量
    return stack.size();
}
}
