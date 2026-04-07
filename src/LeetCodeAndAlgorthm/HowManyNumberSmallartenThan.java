package LeetCodeAndAlgorthm;

import java.util.Arrays;

public class HowManyNumberSmallartenThan {
    static void main() {

    }

    static public int []howmanynumbersmallarten(int  [] nums) {
         int mydata[]=new int [nums.length];


        for (int i = 0; i < nums.length - 1; i++) {
            int put=0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >=   nums[j]) {
                    put++;

                }

            }
            mydata[i]=put;

        }
        return mydata;
    }
}
