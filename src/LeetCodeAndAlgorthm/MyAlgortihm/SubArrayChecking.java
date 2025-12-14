package LeetCodeAndAlgorthm.MyAlgortihm;

public class SubArrayChecking {

    // Two Pointer // String // String Matchsing Approaches
    public static void main(String[] args) {


    }
    public static boolean SubArrayChecking(String s, String goal) {
        char first = goal.charAt(0);
        char last = goal.charAt(goal.length() - 1);
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char b = s.charAt(i);
            char c = s.charAt(j);

            if (b == first && c == last) {
                String sub = s.substring(i, j + 1);
                if (sub.equals(goal)) {
                    return true;
                }
            }
            i++;
            j--;
        }
        return false;
    }

    // o n*n approaches



}
