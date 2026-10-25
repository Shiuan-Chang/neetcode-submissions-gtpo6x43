public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        var res = new Dictionary<string,List<string>>();
        foreach (var str in strs) {
            int[] count = new int[26];
            foreach (char s in str) {
                count[s-'a']++;
            }
            string key = string.Join(",",count);
            if(!res.ContainsKey(key)){
                res[key] = new List<string>();
            }
            res[key].Add(str);
        }
        return new List<List<string>>(res.Values);
    }
}
