package LeetCodeAndAlgorthm.MyAlgortihm;
public class TwoSumOfBit {
    public static void main(String[] args) {

        int bit1[] = new int[8];
        int bit2[] = new int[8];

        // Rastgele 0 veya 1 atama
        for (int i = 0; i < 8; i++) {
            bit1[i] = (int) (Math.random() * 2);  // 0 veya 1 üretmek için
            bit2[i] = (int) (Math.random() * 2);
        }

        int mynewint[] = new int[9]; // Sonuç dizisi (8 bit + taşıma için 1 bit)

        int carry = 0; // Taşıma değeri

        // Bitleri sağdan sola toplayarak ilerliyoruz
        for (int i = 7; i >= 0; i--) {
            int sum = bit1[i] + bit2[i] + carry;
            mynewint[i + 1] = sum % 2;  // Son bit (0 veya 1) mynewint'e eklenir
            carry = sum / 2;  // Taşıma değeri (0 veya 1) güncellenir
        }

        // En son taşıma değeri en sola eklenir
        mynewint[0] = carry;

        // Sonucu yazdırma
        System.out.print("Bit 1:    ");
        for (int b : bit1) System.out.print(b);
        System.out.println();

        System.out.print("Bit 2:    ");
        for (int b : bit2) System.out.print(b);
        System.out.println();

        System.out.print("Sonuç: ");
        for (int b : mynewint) System.out.print(b);
        System.out.println();
    }


}

