package LeetCodeAndAlgorthm;

public class StrongPasswordChecker2 {
    static void main() {

    }

    static boolean strongPasswordCheckerII(String password) {
        // 1. Uzunluk kontrolü
        if (password.length() < 8) {
            return false;
        }

        String specialChars = "!@#$%^&*()-+";
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // 2. Bitişik aynı karakter kontrolü
            if (i > 0 && c == password.charAt(i - 1)) {
                return false;
            }

            // Karakter türlerini tek tek kontrol ediyoruz
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        // Tüm boolean değişkenler true ise şifre güçlüdür
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
