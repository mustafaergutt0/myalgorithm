package LeetCodeAndAlgorthm;

public class StringToInteger {
    public static void main(String[] args) {

    }

    public int myAtoi(String str) {
        char[] firstChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < firstChar.length; i++) {
            if (str.charAt(0) != firstChar[i]) {
                return 0;
            }

        }
        return  5;
    }
}




