package LeetCodeAndAlgorthm;

import java.util.Stack;

public class LongesİncreaingSubscribeLeetCode {

    int [] myarray={10,9,2,5,3,7,101,18};


    public static void main(String[] args) {

    }


    public static int LongestİncreaingSubscribeLeetCode(int [] array) {

        Stack<Integer> stack = new Stack<Integer>();
        int count=0;
        for (int i = 0; i < array.length; i++) {

            if(stack.isEmpty()) {
                if(array[i+1]>array[i]){
                    count++;
                    stack.push(array[i]);
                }else{
                    while(stack.empty()){
                        stack.pop();
                        count=0;
                    }
                }

            }
        }
        return count;





    }


}
