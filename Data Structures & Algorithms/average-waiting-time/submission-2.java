class Solution {
    public double averageWaitingTime(int[][] customers) {
        long customersNum = customers.length;
        long totalTime = 0; 
        long freeTime = 0;
        

        for (int i = 0; i < customers.length; i++){
            long arrivalTime = customers[i][0];
            long prepareTime = customers[i][1];
            long startTime = Math.max(freeTime, arrivalTime);
            long endTime = startTime + prepareTime;
            freeTime = endTime;
            long waitingTime = endTime - arrivalTime;
            totalTime += waitingTime;
        }
        return  (double)totalTime / customersNum;
    }
}