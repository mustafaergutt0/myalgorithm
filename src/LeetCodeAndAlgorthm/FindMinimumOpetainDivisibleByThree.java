package LeetCodeAndAlgorthm;

public class FindMinimumOpetainDivisibleByThree {
    static void main() {

    }
    static public int minimumOpetainDivisibleByThree(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;


    }
}
