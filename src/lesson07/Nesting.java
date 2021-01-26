package lesson07;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        Stack<Character> stack = new Stack<>();

        for(char character : S.toCharArray()) {

            if(stack.isEmpty()) {
                stack.push(character);
                continue;
            }

            if(stack.peek() == '(' && character == ')') stack.pop();
            else stack.push(character);
        }

        return stack.isEmpty() ? 1 : 0;

    }
}
