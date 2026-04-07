package LeetCodeAndAlgorthm;

public class ReverseStringPrefix {

    static void main() {
        System.out.println(reverseStr("bacd",2));

    }

    public  static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String first = s.substring(0, k);
        sb.append(first);
        sb.reverse();
        String last = s.substring(k);
        sb.append(last);

        return  sb.toString();

    }
}
