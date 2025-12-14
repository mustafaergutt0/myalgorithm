package LeetCodeAndAlgorthm;

import java.sql.SQLOutput;
import java.util.Stack;

public class LargestRectangularLeetCode {

    public static void main(String[] args) {
        int data[] = {2, 5, 2,0, 6, 6};
        System.out.println(largestRectangleArea(data));

    }


    public static int largestRectangleArea(int[] heights) {
        int maxSum = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            // 1) Başlangıçta kendi barımızın yüksekliği kadar alana sahibiz
            int sum = heights[i];

            // 2) Sağa bak: daha küçük bir yükseklik gelene kadar her adımda heights[i] ekle
            for (int j = i + 1; j < n; j++) {
                if (heights[j] < heights[i]) {
                    break;
                }
                sum += heights[i]; // direk örnekti gibi aslında bkatığımız ekle
            }

            // 3) Sola bak: yine daha küçük bir yükseklik gelene kadar heights[i] ekle
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] < heights[i]) {
                    break;
                }
                sum += heights[i];
            }

            // 4) En büyük toplamı güncelle
            maxSum = Math.max(maxSum, sum);
        }


        return maxSum;
    }



}
