package LeetCodeAndAlgorthm;

public class ScopeOfString {

    static void main() {


        System.out.println(ScoreOfString("MUSTAFA"));



    }


    static public int ScoreOfString(String S) {
        int count0 = 0;
        for (int i = 0; i < S.length()-1; i++) {
            char c = S.charAt(i);
            char b=S.charAt(i+1);
            int forc= (int) c;
            int forb= (int) b;
            count0=count0+Math.abs(forc-forb);
        }

        return count0;

    }
}
