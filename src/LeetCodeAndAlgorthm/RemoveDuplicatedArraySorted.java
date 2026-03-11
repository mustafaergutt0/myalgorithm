package LeetCodeAndAlgorthm;

public class RemoveDuplicatedArraySorted {
    static void main() {

    }



    static public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int k  = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];

            }
        }

        return k ;
    }







}
