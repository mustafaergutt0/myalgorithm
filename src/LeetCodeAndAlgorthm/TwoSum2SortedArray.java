package LeetCodeAndAlgorthm;

public class TwoSum2SortedArray {
    static void main() {

        // verilen sorted  i <j  olacak şekilde verilen target equals  in two element of array i j respectivly

        // you are in given idnex 1 so you should retunr incremetn one these two indices


    }

    static public int [] twoSum(int[] numbers, int target) {
        int data[]=new int [2];
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            int sum=numbers[left]+numbers[right];
            if (sum==target){
                data[0]=left+1;
                data[1]=right+1;
                return data;
            }if (sum>target){
                right--;
            }else{
                left++;
            }
        }


        return data;


    }
}
