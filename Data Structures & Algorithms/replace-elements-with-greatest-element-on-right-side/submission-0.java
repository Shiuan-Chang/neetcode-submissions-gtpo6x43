class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rightMax = -1;
        int newMax = 0;

        for (int r = n-1; r >= 0; r--){
            newMax = Math.max(arr[r],rightMax);
            arr[r] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }
}