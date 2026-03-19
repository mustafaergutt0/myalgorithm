package LeetCodeAndAlgorthm;

public class AddStrins {
    static void main() {

        System.out.println(addStr("123", "456"));

    }

// mantık şu her elimideki sayılara bulup ona yazıyoruz


    static public String addStr(String num1, String num2) {
        int toplamA = 0;
        int carpanA = 1;


        for (int i = num1.length() - 1; i >= 0; i--) {

            String karakter = String.valueOf(num1.charAt(i));
            int rakam = Integer.parseInt(karakter);

            toplamA += rakam * carpanA;
            carpanA *= 10;
        }

        int toplamB = 0;
        int carpanB = 1;
        for (int i = num2.length() - 1; i >= 0; i--) {
            String karakter = String.valueOf(num2.charAt(i));
            int rakam = Integer.parseInt(karakter);

            toplamB += rakam * carpanB;
            carpanB *= 10;
        }

        // İkisini topla ve tekrar String yap
        int sonuc = toplamA + toplamB;
        return String.valueOf(sonuc);

    }

    static public String addStr1(String num1, String num2) {
        StringBuilder sonuc = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int elde = 0;


        while (i >= 0 || j >= 0 || elde > 0) {


            int sayi1 = (i >= 0) ? Integer.parseInt(String.valueOf(num1.charAt(i))) : 0;
            int sayi2 = (j >= 0) ? Integer.parseInt(String.valueOf(num2.charAt(j))) : 0;

            int toplam = sayi1 + sayi2 + elde;
            elde = toplam / 10;
            sonuc.append(toplam % 10);

            i--;
            j--;
        }


        return sonuc.reverse().toString();
    }
}
