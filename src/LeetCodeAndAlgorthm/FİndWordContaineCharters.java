package LeetCodeAndAlgorthm;

import java.util.LinkedList;
import java.util.List;

public class FİndWordContaineCharters {


    static void main() {


        String mystring[]={"leet","code"};
        System.out.println(findword(mystring,'e'));

    }



    static List<Integer> findword(String word[], char x){
        List<Integer> mylist= new LinkedList<>();

        for(int i=0;i<word.length;i++){
            for(int j=0;j<word[i].length();j++){
                if(word[i].charAt(j)==x){
                    mylist.add(i);
                    break;  // bir daha aynı elemandan varsa fdöngüyü kırıp çıksın
                }
            }
        }


        return mylist;



    }
}

