package valid_parentheses;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
class Solution1 {

    /**
     * 使用了栈数据结构
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char value : array) {
            if(stack.size() == 0){
                stack.add(value);
            } else if (isSymmetry(stack.peek(), value)) {
                stack.pop();
            } else {
                stack.add(value);
            }
        }
        return stack.size() == 0;
    }

    private boolean isSymmetry(char c, char t){
        switch (c){
            case '{' :
                return t == '}';
            case '[' :
                return t == ']';
            case '(' :
                return t == ')';
        }
        return false;
    }
}
