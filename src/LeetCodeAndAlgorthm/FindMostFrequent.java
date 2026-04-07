package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequent {

    static void main() {

    }


    static int maxFrquency(String s){
        int count=0;
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonant = new HashMap<>();
        char arr[]={'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (arr.equals(c)){
                vowel.put(c,vowel.get(c)+1);
            }else{
                consonant.put(c,consonant.get(c)+1);
            }

        }
        int max1=0;
        int max2=0;


        return count;

    }
}
