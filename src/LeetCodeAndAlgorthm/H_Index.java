package LeetCodeAndAlgorthm;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class H_Index {
    static void main() {
        
    }
    static int hIndex(int[] citations) {
        int citat=0;

        Integer a =new Integer(Integer.MIN_VALUE);

        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++) {
            citat=Math.max(citat,citations[i]);
        }

        return citat;

    }
}
