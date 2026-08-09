class Solution {
    public String largestGoodInteger(String num) {
        char[] numChar = num.toCharArray();
        int length = 1;
        char tempWord = '0';
        boolean found = false;

        for (int i = 0; i < numChar.length - 1; i++){
            if (numChar[i] == numChar[i+1]){
                length++;
            } else {
                length = 1;
            }

            if (length >= 3){
                found = true;
                if (numChar[i] >= tempWord){
                    tempWord = numChar[i];
                }
            }
        }

        if (!found){
            return "";
        }

        char[] res = new char[3];
        for (int i = 0; i < 3; i++){
            res[i] = tempWord;
        }
        return new String(res);
    }
}