package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// thre sum çözümü o n 2 ile çok mantıklı bir yaklşaım fakat aynı sayı tekrar geelbirl onu unutma bence
public class ThreeSum {
    static void main() {


        int newdata[]= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(newdata));


    }



    static public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            int  l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                }if(sum > 0){
                    r--;
                }
                if (sum > 0)
                    l++;
                else if (sum < 0)
                    r--;
            }

        }

        return res;

    }
}
