package LeetCodeAndAlgorthm;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyABoolean(18));

    }

    public static  boolean isHappyABoolean(int n) {
        Set<Integer> seen = new HashSet<>();
        // n 1’e ulaşana ya da daha önce gördüğümüz bir değere denk gelene kadar dön
        while (n != 1 && !seen.contains(n)) { // eğer daha önceli bri değeri içeriyotsa bu döngüye girmez veya n bir ise
            seen.add(n);
            n = returnNumber(n);          // Önemli: dönen yeni değeri n’e ata
        }
        return n == 1;                   // 1’e ulaştıysa true, aksi false
    }

    // returnNumber metodu da şöyle olmalı:
    public static int returnNumber(int n) {
        int number = 0;
        while (n > 0) {
            int digit = n % 10;          // sondaki rakamı al
            number += digit * digit;    // karesini topla
            n /= 10;                     // sondaki rakamı at
        }
        System.out.println(number);
        return number;
    }


}
