class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sTot = new HashMap<>();
        Map<Character, Character> tTos = new HashMap<>();

        for (int i = 0; i < s.length(); i++){

            if (sTot.containsKey(s.charAt(i)) && t.charAt(i) != sTot.get(s.charAt(i))){
                return false;
            }
            if (tTos.containsKey(t.charAt(i)) && s.charAt(i) != tTos.get(t.charAt(i))){
                return false;
            }

            sTot.put(s.charAt(i),t.charAt(i));
            tTos.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}