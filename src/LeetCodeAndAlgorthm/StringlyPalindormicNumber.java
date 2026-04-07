package LeetCodeAndAlgorthm;

public class StringlyPalindormicNumber {
    static void main() {

    }



    static boolean isPalindromeBina(int n) {
        String a =intToBinary(n);
        return  isPalindrome(a);

    }


    public static String intToBinary(int n) {
        if (n == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2); // Kalanı sona ekle
            n /= 2;               // n = n / 2
        }

        // Kalanları sona eklediğimiz için string'i ters çevirmemiz gerekir
        return binary.reverse().toString();
    }

    public static boolean isPalindrome(String str) {

        int uzunluk = str.length();
        boolean flag = true;


        for (int i = 0; i < uzunluk / 2; i++) {
            // Baştaki karakter ile sondaki karakteri kıyasla
            if (str.charAt(i) != str.charAt(uzunluk - 1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;

    }


}
