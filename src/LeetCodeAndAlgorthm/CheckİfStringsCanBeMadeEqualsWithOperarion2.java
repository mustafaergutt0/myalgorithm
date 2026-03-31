package LeetCodeAndAlgorthm;

import java.util.Arrays;
import java.util.HashMap;

public class CheckİfStringsCanBeMadeEqualsWithOperarion2 {
    static void main() {

    }


    static  boolean CheckStrings(String s1, String s2) {

        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> evens1 = new HashMap<>();
        HashMap<Character, Integer> odds1 = new HashMap<>();
        HashMap<Character, Integer> evens2 = new HashMap<>();
        HashMap<Character, Integer> odds2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            // i % 2 == 0 çift indis demektir
            if(i % 2 == 0) {
                // s1.charAt(a) değil, sadece a kullanmalısın (zaten karakter o)
                evens1.put(a, evens1.getOrDefault(a, 0) + 1);
                evens2.put(b, evens2.getOrDefault(b, 0) + 1);
            } else {
                odds1.put(a, odds1.getOrDefault(a, 0) + 1);
                odds2.put(b, odds2.getOrDefault(b, 0) + 1);
            }
        }

        // s1'in çiftleri s2'nin çiftlerine, s1'in tekleri s2'nin teklerine eşit olmalı
        boolean checkEvens = evens1.equals(evens2);
        boolean checkOdds = odds1.equals(odds2);

        return checkEvens && checkOdds;

    }


    public boolean checkStringsEasySolution(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            int offset = (i & 1) << 7;
            count1[offset + s1.charAt(i)]++;
            count2[offset + s2.charAt(i)]++;
        }

        return Arrays.equals(count1, count2);
    }
// gerçek bri senior yakşaşmı

    /*
     a ascı karakteri 97
     ike  z nin acıs 122
     ingilicede 26 harf var lowercae -a- yaprak 0 dan 26 kadar indexşelri koyduk ve aynı harften tekrar gelicne o indexi artıyoruz

     // aslında harfler bizim yerimide 0 26 kadar olan sayılarş tutmuş içindeki  ler ise hash table gibi kçate olduğu ghöster


     //  performans olarak harika tabiki bu soliıti0on daha hızlı iken

     // alan hashmap daha iyi performans gösterdi








     */
    public boolean CheckMysoluiton(String s1, String s2) {
        int fre1[]=new int [26];
        int fre2I[]=new int [26];

        for(int i = 0; i < s1.length(); i+=2) {
            fre1[s1.charAt(i)-'a']++;
            fre2I[s2.charAt(i)-'a']++;

        }
        for(int i = 0; i < 26; i++) {
            if(fre1[i] != fre2I[i]) return false;
            fre1[i] =0;
            fre2I[i] =0;
        }

        for(int i = 1; i < s1.length(); i+=2) {
            fre1[s1.charAt(i) - 'a']++;
            fre2I[s2.charAt(i) - 'a']++;

        }
        for(int i = 0; i < 26; i++) {
            if(fre1[i] != fre2I[i]) return false;
        }
        return true;

    }


}
