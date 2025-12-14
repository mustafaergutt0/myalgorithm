package LeetCodeAndAlgorthm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        // sondan başa: +1 ver, 9 değilse bitti
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {        // 0–8 arasındaysa
                digits[i]++;            // +1 yap ve bitir
                return digits;          // aynı dizi döneriz
            }
            digits[i] = 0;              // 9 ise 0 yap, taşıma devam edecek
        }

        // buraya sadece tüm rakamlar 9 ise geliriz (99 → 100 gibi)
        int[] res = new int[digits.length + 1];
        res[0] = 1;                     // 1 0 0 … dizisi
        return res;
    }

}
