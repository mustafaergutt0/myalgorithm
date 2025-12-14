package LeetCodeAndAlgorthm.MyAlgortihm;

import java.util.Stack;

public class JavaBracets {
    public static void main(String[] args) {

        String sample="(((((())";
        System.out.println(IsBrackets(sample));

    }


    public  static boolean IsBrackets(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(' || c == '{' || c == '[' )   {
                stack.push(c);
            }else{
                if (c == ')' || c == '}' || c == ']' || c == ',') {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
