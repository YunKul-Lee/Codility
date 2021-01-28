package lesson07;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int i=0; i < H.length; i++) {
            if(stack.isEmpty() || H[i] > stack.peek()) {
                count++;
                stack.push(H[i]);
            } else if(H[i] < stack.peek()) {
                stack.pop();
                i--;
            }
        }
        return count;
    }
}
