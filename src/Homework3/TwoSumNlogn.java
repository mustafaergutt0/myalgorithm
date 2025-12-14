package Homework3;

import java.util.Arrays;

/*
1. Describe a Θ(n logn)-time algorithm that, given a set S of n integers and another integer x,
 determines whether or not there exist two elements in S whose sum is exactly x. Hint: you can use binary search.

 */

public class TwoSumNlogn {
    public static void main(String[] args) {
        int md[]={0,5,68,15,53,55,1,2,3,5};
        System.out.println(twoSum(md,3));


    }
    public static boolean twoSum(int[] nums, int n) {
        Arrays.sort(nums); // this religon takes nlog time comp
        for (int i = 0; i < nums.length; i++) {
            int a =nums[i];
            int b=n-a;
            int c=Arrays.binarySearch(nums,i+1,nums.length,b); // logn
            if(c>1){
                return true;
            }
        }
            return false;
    }


}