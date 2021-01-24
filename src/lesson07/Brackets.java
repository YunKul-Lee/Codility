package lesson07;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {

        Stack<Character> stack = new Stack<>();
        char lastItem;
        for(char item : S.toCharArray()) {
            if(item == '(' || item == '[' || item == '{') {
                stack.push(item);
            } else {
                if(stack.isEmpty()) return 0;

                lastItem = stack.pop();

                if(item == ')' && lastItem != '(') return 0;
                if(item == ']' && lastItem != '[') return 0;
                if(item == '}' && lastItem != '{') return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
