package LeetCodeAndAlgorthm;


// in given array all of number is twiced except one find it

// ı have used HaspMap to keep which number how much and return added number 1

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SİngleNumberLeetCode {



    public static  void main(String[] args) {

        int data[]={2,2,3,3,4,1,1};
        System.out.println(SingleNumberwithXor(data));

    }

    public static  int SingleNumber(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap();

        for(int x :nums){
            //  nortmalyl hasp map example hashMap.put(x,1);
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }
        for(int x :nums){
            if(hashMap.get(x)==1){
                return x;
            }

        }
        return -1;
    }

    // Other way is to use XOR methot

    public static  int SingleNumberwithXor(int[] nums) {
        int result=0;
        for(int x :nums){
            result ^= x;
        }
        return result;
    }

}
