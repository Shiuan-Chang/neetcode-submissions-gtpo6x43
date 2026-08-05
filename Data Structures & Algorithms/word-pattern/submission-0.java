class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternArray = pattern.toCharArray();
        String[] sArray = s.split(" ");

        if (patternArray.length != sArray.length){
            return false;
        }

        Map<Character, String> pTos = new HashMap<>();
        Map<String,Character> sTop = new HashMap<>();

        for (int i = 0; i < patternArray.length; i++){
            if (pTos.containsKey(patternArray[i])){
                if(!sArray[i].equals(pTos.get(patternArray[i]))){
                    return false;
                }
            }
            pTos.put(patternArray[i], sArray[i]);
        }

        for (int i = 0; i < sArray.length; i++){
            if (sTop.containsKey(sArray[i])){
                if(patternArray[i] != sTop.get(sArray[i])){
                    return false;
                }
            }
            sTop.put(sArray[i], patternArray[i]);
        }

         return true;
    }
}