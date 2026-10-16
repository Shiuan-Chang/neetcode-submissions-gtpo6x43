class Solution {

    public String encode(List<String> strs) {
        // 5#Hello5#World
        StringBuilder ans = new StringBuilder();
        for (String str : strs){
            ans.append(str.length()).append("#").append(str);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }

        return res;
    }
}
