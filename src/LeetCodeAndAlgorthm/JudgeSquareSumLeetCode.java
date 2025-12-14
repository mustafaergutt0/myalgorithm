package LeetCodeAndAlgorthm;

public class JudgeSquareSumLeetCode {
    public static void main(String[] args) {
        judgeSquareSum(100);

    }
    public static boolean judgeSquareSum(int c) {
        if (c < 0){
            return false;
        }
        if (c < 0) return false;          // negatifse zaten mümkün değil

        long left  = 0;
        long right = (long) Math.sqrt(c); // en büyük aday

        while (left <= right) {


            if ((left * left + right * right) == c) {
                if(right==c){
                    right--;
                }
                System.out.println("left" + " " + left
                        + " "+ "right" +  " "  +  right);
                return true;              // a = left, b = right bulundu
            } else if ((left * left + right * right) < c) {
                left++;                   // toplamı büyüt
            } else {
                right--;                  // toplamı küçült
            }
        }
        return false;                     // hiçbir çift uymadı
    }
}
