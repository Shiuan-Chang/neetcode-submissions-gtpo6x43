class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int w : weights)
        {
            left = Math.max(left,w);
            right += w;
        }

        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (canFind(weights, days, mid)){
                right = mid - 1;
            }
            else {left = mid + 1;}
        }

        return left;
    }

    private boolean canFind(int[] weights, int days, int capacity){
            int daysNeed = 1;
            int loads = 0;
            for (int w : weights){
                if (loads + w > capacity){
                    daysNeed++;
                    loads = 0;
                }
                loads+=w;
            }
            return daysNeed <= days;
        }
}