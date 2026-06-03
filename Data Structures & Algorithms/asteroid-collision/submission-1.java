class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int curr : asteroids)
        { 
            while (!stack.isEmpty() && curr < 0 && stack.peek() > 0)
            {
                int diff = curr + stack.peek();
                if (diff < 0)
                {
                    stack.pop();
                }
                else if (diff > 0)
                {
                    curr = 0;
                }
                else
                {
                    curr = 0;
                    stack.pop();
                }
            }

            if (curr != 0)
            {
                stack.push(curr);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++)
        {
            res[i] = stack.get(i);
        }

        return res;



        // (+, -)  →←   位置：左→右，方向：面對面  💥 會碰
        // (-, +)  ←→   位置：左→右，方向：背對背  永遠不碰

        // two asteroids meet when the left one move right(+), the right move left(-)
        // => stack.push(+), curr(-) => stack.pop() and compare
        // => if 






        


    }
}