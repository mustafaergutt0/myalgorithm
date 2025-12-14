package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class RomanToIntegerLeetCode {
    // in this algortihm we find roman to be watied to ınteger
    // firstl wwe defined some priviligance step
    // and every char on string will be replaced coming from data HashMap
    public static void main(String[] args) {
        System.out.println(romanToInt(""));
    }
    public static int romanToInt(String s) {

        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int number=0;
        int c=0;
        HashMap<Character,Integer> mymap=new HashMap();
        mymap.put('I',1);
        mymap.put('V',5);
        mymap.put('X',10);
        mymap.put('L',50);
        mymap.put('C',100);
        mymap.put('D',500);
        mymap.put('M',1000);
        for( c=0;c<s.length();c++){
            number=number+mymap.get(s.charAt(c));
        }
      return number;
    }
}
