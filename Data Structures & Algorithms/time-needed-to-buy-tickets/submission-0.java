class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;

        while (tickets[k] > 0){
            for (int i = 0; i < tickets.length; i++){
                if (tickets[i] == 0){continue;}
                tickets[i] -= 1;
                res++;
                 if (i == k && tickets[k] == 0){
                    return res;
                }
            }
        }
        return res;
    }
}