package LeetCodeAndAlgorthm;

import java.util.Stack;

public class CheckallAbeforeBAppear {
    static void main() {
        System.out.println(CheckAllaberofer("aaabbbb"));

    }

    static public boolean CheckAllaberofer(String s){
        return false==s.contains("ba");  // my solution

    }

    static public boolean CheckAllaberofer1(String s){
        // other solution
        boolean seenB = false;
        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                seenB = true;
            }else if(ch == 'a' && seenB){
                return false;
            }
        }
        return true;

    }

}
