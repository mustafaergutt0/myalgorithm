package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayfROMOFıNTEGER {

    static void main() {



    }


    static public List<Integer> addToArrayF(int []nums ,int k )  {

        List<Integer> list = new ArrayList<>();
        int i = nums.length - 1;


        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k =k + nums[i];
            }

            list.add(k % 10);


            k /= 10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }


}
