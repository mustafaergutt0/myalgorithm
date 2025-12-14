package LeetCodeAndAlgorthm;

public class RotateStringLeetCode {
    public static void main(String[] args) {


    }




    public  static boolean rotateStringV2(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // Create a new string by concatenating 's' with itself
        String doubledString = s + s;

        // Use contains to search for 'goal' in 'doubledString'
        // If contains return true, 'goal' is a substring
        return doubledString.contains(goal);

    }

    /*
    Understanding the problem and the constraints: The problem involves rotations, i.e.,
    moving the leftmost character to the rightmost position. It's also mentioned that the two strings s and goal are of the same length.

Observing examples: If we manually perform the rotations and observe the results,
we may notice a pattern. For example, for s = "abcde", the rotations would be: "bcdea", "cdeab", "deabc", "eabcd", and back to "abcde".

Noticing patterns and forming insights:
From the examples, we might notice that all the rotated strings are substrings of s + s = "abcdeabcde". Thus, we can check if goal is a substring of s + s to see if s can be rotated to form goal.

Verifying the insight:
 We can confirm this insight by trying various examples and corner cases, and seeing if this pattern holds true in every case.













     */
}
