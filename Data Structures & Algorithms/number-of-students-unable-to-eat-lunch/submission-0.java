class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // 不符合的人往後排，直到找到符合口味的人，然後三明治拿走，人也離開
        // 要是剩下的人有符合的口味，但最上層的三明治是不符合的口味，拿不掉，就是無法拿到符合口味三明治的人
        // 通常這個情況下，三明治口味和需求的人數也不同
        int cCount = 0;
        int sCount = 0;

        for (int s : students){
            if (s == 0){
                cCount++;
            }
            else{
                sCount++;
            }
        }

        for (int s : sandwiches){
            
            if (s == 0 && cCount > 0){
                cCount--;
            }
            else if (s == 1 && sCount > 0){
                sCount--;
            }

            else{
                break;
            }
        }
        return cCount + sCount;
    }
}