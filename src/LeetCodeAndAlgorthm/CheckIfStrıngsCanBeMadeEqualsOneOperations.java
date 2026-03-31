package LeetCodeAndAlgorthm;

public class CheckIfStrıngsCanBeMadeEqualsOneOperations {

    static void main() {

    }


    public boolean canBeEqual(String s1, String s2) {
        // Çift indeksleri kontrol et (0 ve 2)
        boolean evenMatch = (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        // Tek indeksleri kontrol et (1 ve 3)
        boolean oddMatch = (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return evenMatch && oddMatch;
    }
}
