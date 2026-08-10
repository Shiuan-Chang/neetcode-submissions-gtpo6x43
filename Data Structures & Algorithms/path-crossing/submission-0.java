class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> visit = new HashSet<>();
        visit.add(x + "," + y);

        for (char c : path.toCharArray()){
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'W') x--;
            else if (c == 'E') x++;

            String pos = x + "," + y;
            if (visit.contains(pos)){
                return true;
            }
            visit.add(pos);
        }
        return false;
    }
}