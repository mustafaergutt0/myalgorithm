package LeetCodeAndAlgorthm.MyAlgortihm;

public class PivotİndexLeetCode {
    public static void main(String[] args) {
        int data[] = {2,-1,1-1,2};
        System.out.println(pivot(data));
    }

    public static int pivot(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int sumleft = 0;
            int sumright = 0;

            // Sol tarafın toplamını hesapla
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    sumleft += nums[j];
                } else if (j > i) {
                    sumright += nums[j];
                }
            }

            // Sol ve sağ toplamları eşitse pivot indeksini döndür
            if (sumleft == sumright ) {
                return i;
            }
        }
        return -1; // Pivot indeksi yoksa -1 döndür
    }
}
