package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class TwoSNEAKYNUMBERS {
    static void main() {

    }

     public int [] sneakyNumbers(int []nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int data[]=new int [2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         int a=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==2){
                data[a]=nums[i];
            }
            a++;
        }

        return data;

     }








}
