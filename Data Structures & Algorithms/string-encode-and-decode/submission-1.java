class Solution {

    public String encode(List<String> strs) {
        // use length#string so decoder knows exactly how many chars to read (長度為了確定字串字數，及時裡面包含特殊符號員也不受影響;#(delimiter)則拿來判斷從哪裡開始切。不採用數字之後直接切，是因為字數有可能是9,12...不好處理，所以用分隔號直接辨識)
        StringBuilder ans = new StringBuilder();
        for (String str : strs)
        {
            ans.append(str.length()).append("#").append(str);
        }
        return ans.toString();
    }
    // "5#Hello5#World"

    public List<String> decode(String str) {
        // get the length (index i)
        // find # (index j)
        // if find # : get the string after #
        List<String> ans = new ArrayList<>();

        int i= 0;

        while (i < str.length())
        {
            int j = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j+1, j+1+len));
            i = j +len + 1;
        } 
        return ans;
    }
}
