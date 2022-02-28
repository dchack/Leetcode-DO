package simplify_path;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/simplify-path/
 */
public class Solution1 {


    public static void main(String[] args) {
        String path = "/../";
        System.out.printf(new Solution1().simplifyPath(path));
    }

    public String simplifyPath(String path) {
        String[] array = path.split("/");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < array.length; ++i) {
            if ("".equals(array[i]) || ".".equals(array[i])) {
                continue;
            } else if ("..".equals(array[i])) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(array[i]);
            }
        }

        StringBuilder sb = new StringBuilder("/");
        for (String value : stack) {
            sb.append(value).append("/");
        }
        return sb.length() > 1 ? sb.substring(0, sb.length() - 1) : "/";
    }
}
