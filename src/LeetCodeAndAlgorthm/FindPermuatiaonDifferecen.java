package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class FindPermuatiaonDifferecen {
    static void main() {

    }


    static public int findPermutaionint(String s , String t){

        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
            map2.put(t.charAt(i),i);
        }

        for(int i=0;i<s.length();i++){
            int a =Math.abs(map.get(s.charAt(i))-map.get(t.charAt(i)));
            count+=a;
        }

        return count;

    }
    static public int findPermutaionintEASYsoLUTİION(String s , String t){
        int sum= 0;
        for(int i=0 ;i<t.length();i++)
        {
            int c=t.indexOf(s.charAt(i));  // it gives index of
            int temp = i - t.indexOf(s.charAt(i));   // çok yaratcı mnid
            // mid level solution çözümü
            sum  =  sum + Math.abs(temp);
        }
        return sum;

    }


}
