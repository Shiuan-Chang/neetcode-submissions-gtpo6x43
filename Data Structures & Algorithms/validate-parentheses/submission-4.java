class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!map.get(top).equals(c)) return false;
            }
        }
        return stack.isEmpty();
    }
    
}
