package LeetCodeAndAlgorthm;

import java.util.Arrays;
import java.util.HashMap;

public class NRepetedElementİnSize2d {
    static void main() {

        int data []={1,2,3,3};
        System.out.println(repeteadNtimes(data));

    }

   // count repeted n times  n is nto given its prdocut of nums.lenght via2
    static public int repeteadNtimes(int nums[]){
        int repte= nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==repte){
                return nums[i];
            }
        }
       return -1;

    }
}
