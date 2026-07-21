class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<String>();
        StringBuilder current = new StringBuilder();
        backtrack(current, 0, 0, n);
        return res;
    }

    private void backtrack(StringBuilder current, int open, int close, int n){
        if (close == n){
            res.add(current.toString());
        }
        if (open < n){
            current.append("(");
            backtrack(current, open + 1, close, n);
            current.deleteCharAt(current.length()-1);
        }
        if (open > close){
            current.append(")");
            backtrack(current, open, close + 1, n);
            current.deleteCharAt(current.length()-1);
        }
    }
}
