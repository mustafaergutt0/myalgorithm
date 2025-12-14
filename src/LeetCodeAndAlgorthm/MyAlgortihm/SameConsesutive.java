package LeetCodeAndAlgorthm.MyAlgortihm;

import java.util.Stack;

public class SameConsesutive {
    public static void main(String[] args) {
        int data[]={1,2,3,5,6,6,6,6,5,6,2,};

    }

    public int SameConsesutive(int[] A) {
        Stack<Integer> stack = new Stack<>();

        stack.push(A[0]);
        for (int i = 1; i < A.length; i++) {
            if(stack.peek() != A[i]){
                stack.pop();
                stack.push(A[i]);
            }else{
                stack.push(A[i]);
            }

        }
        return stack.size();
    }
}

