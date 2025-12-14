package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// from to n we have  numbers but some number is not seeming find them which number print screen



public class FindAllofNumberDisapper {
    public static void main(String[] args) {
        int mydata[]={1,1,1,2,3,1,5,6,2,3,8,4,2,6};
        System.out.println(findDisappearedNumbers(mydata));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(!map.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }
}
