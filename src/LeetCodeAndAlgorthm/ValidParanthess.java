package LeetCodeAndAlgorthm;

import java.util.Stack;

public class ValidParanthess {

    static void main() {
        System.out.println(ValidParentheses("()(())"));

    }



    static public int ValidParentheses(String s){
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                stack.push(i);
            }if(s.charAt(i)==')' & !stack.isEmpty()){
                stack.pop();
                count+=2;
            }

        }
        return count;

    }

    static public int longestValidParentheses1(String s){

        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Hayali başlangıç sınırı (Kritik nokta!)
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Açılışın indeksini koy
            } else {
                stack.pop(); // Kapanış geldi, eşleşme ihtimaline karşı çıkar  stackten atıyoruz
                if (stack.isEmpty()) {
                    // Stack boşsa, bu ')' eşleşemedi demektir.
                    // Yeni başlangıç sınırımız artık burası.
                    stack.push(i);
                } else {
                    // Stack boş değilse, geçerli bir aralıktayız.
                    // Güncel indeks - Stack'in tepesindeki son sınır = Mevcut uzunluk
                    maxCount = Math.max(maxCount, i - stack.peek());
                }
            }
        }
        return maxCount;

    }
}
