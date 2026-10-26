class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> match = new HashMap<>();
        match.put('(',')');
        match.put('[',']');
        match.put('{','}');

        for (char c : s.toCharArray()){
            if (match.containsKey(c)){ // 這是為了檢驗c是開括號而非閉括號
                stack.push(match.get(c));
            }
            else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }

        return stack.isEmpty();

        // }
        // {[}]
        //{{{
    }
}
