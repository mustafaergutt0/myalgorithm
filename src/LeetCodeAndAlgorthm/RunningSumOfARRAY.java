package LeetCodeAndAlgorthm;

public class RunningSumOfARRAY {
    static void main() {

    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int[] res = new int[nums.length];
        for(int j =nums.length-1; j >= 0; j--){
            res[j] = sum;
            sum-=nums[j];
        }
        return res;
    }
}
