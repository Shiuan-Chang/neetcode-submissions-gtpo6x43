public class Solution {
    public bool IsValid(string s) {
        Stack<char> stack = new Stack<char>();
        Dictionary<char,char> pairs = new Dictionary<char,char>
        {
            {')','('},
            {']','['},
            {'}','{'}
        };

        foreach(char n in s)
        {
            if (pairs.ContainsKey(n))
            {
                if(stack.Count > 0 && stack.Peek()==pairs[n])
            {
                stack.Pop();
            }
            else
            {return false;}
                
            }
            else{stack.Push(n);}
        }
        return stack.Count == 0;
    }
}
