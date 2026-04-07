package LeetCodeAndAlgorthm;

import java.util.Scanner;

public class MyalgoritmhN11 {


    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FizzBuzz(n));

    }


    public static String FizzBuzz(int num) {
        String mystring="";
       for (int i=1;i<=num;i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               mystring+= "FizzBuzz";

           }else if (i % 3 == 0) {
               mystring+= "Fizz";
           }else if (i % 5 == 0) {
               mystring+= "Buzz";
           }else{
               mystring+= i;
           }
           if(i!=num){
               mystring+=" ";
           }
       }
       return mystring;
    }
}


