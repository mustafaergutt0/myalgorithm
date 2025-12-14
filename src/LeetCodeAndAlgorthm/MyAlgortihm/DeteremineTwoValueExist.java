package LeetCodeAndAlgorthm.MyAlgortihm;

import java.util.Arrays;

public class DeteremineTwoValueExist {
    public static void main(String[] args) {
        int data[]={1,5,6,4,2,12,13};
        System.out.println(TwoValueExist(data,7));



    }
// you are given array and target value , checking two value in array eqausl to your target
    public  static boolean TwoValueExist(int[] arr1, int target) {
        Arrays.sort(arr1);
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            int tar=arr1[left]+arr1[right];
            if(tar==target){
                return true;
            }if(tar>target){
                right--;
            }if(tar<target){
                left++;
            }
        }
        return false;


    }
    // also it can be used binary approaches to solve this problem 
}
