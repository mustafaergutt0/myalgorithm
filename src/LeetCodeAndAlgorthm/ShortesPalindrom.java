package LeetCodeAndAlgorthm;

public class ShortesPalindrom {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));

    }
    public static String shortestPalindrome(String s) {
        String newmy=s.substring(1,s.length());
        StringBuffer sb=new StringBuffer();
        sb.append(newmy);
        sb.reverse();
        String s1=sb.toString();
        String newmystring=s1+s;
        return newmystring;
    }
}
