package LeetCodeAndAlgorthm;


/*


Note: This code correctly finds the longest palindromic substring in a given string by generating all possible substrings and checking if each is a palindrome.
The longestPalindrome function iterates through all substrings, updating the longest variable whenever a longer palindrome is found. However,
 because it checks each substring individually, this approach has a time complexity of O(n^3), which may lead to performance issues for longer strings.

For an optimized solution, consider using the Center Expansion or Dynamic Programming approaches,
both of which offer a more efficient O(n^2) time complexity. Nonetheless, if performance is not a concern,
this code functions correctly as it is





 */
public class LongestPalindromSubsrtingleetCode {
    public static void main(String[] args) {
         // "abba" çıktısını verecek

        System.out.println(isPalindrome2("babad"));
    }

    public static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);  // Tüm alt dizeleri al
                if (isPalindrome(sub)) {
                    if (sub.length() > longest.length()) {
                        longest = sub;  // Daha uzun bir palindrom bulursanız güncelleyin
                    }
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // Eşleşme yoksa palindrom değildir
            }
            left++;
            right--;
        }
        return true;  // Tüm karakterler eşleştiyse palindromdur
    }

    // ı will use two pointer approaches fo find longest palindrome substring

     public static  String isPalindrome2(String s) {
        return "";



     }
}
