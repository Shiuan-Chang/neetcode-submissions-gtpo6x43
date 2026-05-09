class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str:strs)
        {
            sizes.add(str.length());
        }
        for (int size:sizes)
        {
            res.append(size).append(',');
        }
        res.append('#');
        for(String str : strs)
        {
            res.append(str);
        }
        return res.toString();

    }
    // 5,5,#HelloWorld
    public List<String> decode(String str) {
        if (str.length() == 0)
        {
            return new ArrayList<>();
        }
    // 把 encoded string 前半段的「長度資訊」讀出來，存進 sizes，然後把 i 移到真正字串內容的開頭。
    // 把剛剛從 encoded string 裡讀到的長度文字，例如 "5" ，轉成真正的數字，存進 sizes。因為後面要用這些數字來切字串。
    // result: sizes = [5, 5] i = 5

    List<String> res = new ArrayList<>();
    List<Integer> sizes = new ArrayList<>();
    int i = 0;
    while (str.charAt(i) != '#')
    {
        StringBuilder cur = new StringBuilder();
        while(str.charAt(i) != ',')
        {
            cur.append(str.charAt(i));
            i++;
        }
        sizes.add(Integer.parseInt(cur.toString()));
        i++;
    }
    i++;
    for (int sz : sizes)
    {
        res.add(str.substring(i, i + sz));
        i += sz;
    }
    return res;
    }
}
