package LeetCodeAndAlgorthm;

// in given array you should retun consective three odd number
// for example in example below there is 5,7,23 but we have addedd to 2
public class ThreeConsecuviteOddLeetCode {
    public static void main(String[] args) {
        int mydata[]={1,2,34,3,4,5,7,2,23,12};
        System.out.println(ThreeConsecuviteOddLeetCode(mydata));

    }


    public static  boolean ThreeConsecuviteOddLeetCode(int arr[]) {
        for (int i = 1; i <= arr.length-2; i++) {
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) {
                return true;
            }
        }

        return false;
    }

}
