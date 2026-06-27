class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char task : tasks){
            count[task - 'A'] = count[task - 'A'] + 1;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt : count){
            if (cnt > 0){
                maxHeap.offer(cnt);
            }
        }

        int ans = 0;
        List<Integer> temp = new ArrayList<>();
        while (!maxHeap.isEmpty()){
            temp.clear();

            for (int i = 0; i < n + 1; i++)
            {
                if (!maxHeap.isEmpty())
                {
                    int number = maxHeap.poll();
                    number = number - 1;
                    temp.add(number);
                }
                ans++;  
            }

            for (int t : temp)
            {
                if (t > 0) maxHeap.offer(t);
            }

            if (maxHeap.isEmpty()) 
            {
                ans -= (n + 1 - temp.size());
            }
        
            
        }
    return ans;

    }
}
