package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnieqELEMENT {
    static void main() {

        int data[]={1,1,1,1,1,1,2,3};
        System.out.println(sumfoUniq(data));
    }

    static int sumfoUniq(int []nums){
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                count=count+nums[i];
            }
        }



        return count;
    }
}
