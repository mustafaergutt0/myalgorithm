package LeetCodeAndAlgorthm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedSet;
import java.util.stream.IntStream;

public class Is_Subsequence {
    static void main() {

        System.out.println(isSubsequence("abd","adkfgkfkgbd"));




    }


    static public boolean isSubsequence(String s, String t) {
        // Boş string kontrolü (Edge Case)
        if (s.length() == 0) return true;

        int firstS = 0;
        int firstT = 0;

        // t metnini sonuna kadar tara
        while (firstT < t.length()) {
            // Eğer karakterler eşleşiyorsa s'in bir sonraki karakterine geç
            if (s.charAt(firstS) == t.charAt(firstT)) {
                firstS++;
            }

            // Eğer s'in sonuna ulaştıysak her şey tamamdır!
            if (firstS == s.length()) {
                return true;
            }

            firstT++;
        }

        // Döngü bitti ama s'in tüm karakterleri bulunamadıysa false
        return false;
    }




}
