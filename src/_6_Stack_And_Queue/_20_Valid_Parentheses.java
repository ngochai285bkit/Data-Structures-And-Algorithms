package _6_Stack_And_Queue;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stackChar = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                stackChar.push(charArray[i]);
            } else {
                if (stackChar.isEmpty()) {
                    return false;
                }
                char c = stackChar.peek();
                if ((charArray[i] == ')' && c == '(') || (charArray[i] == ']' && c == '[')
                        || (charArray[i] == '}' && c == '{')) {
                    stackChar.pop();
                } else {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{}[][]()()[";
        System.out.println(s + " " + isValid(s));
    }
}
