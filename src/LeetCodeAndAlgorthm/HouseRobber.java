package LeetCodeAndAlgorthm;

public class HouseRobber {

    static void main() {


    }





    static  public int robmyhouse(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int [] RobOrNot=new int[nums.length];
        RobOrNot[0]=nums[0]; // ilk ev
        RobOrNot[1]=Math.max(nums[0], nums[1]);  // birinci evi mi osyalım ikinciyimi // en yüksek parayı depoladık
        for (int i = 2; i < nums.length; i++) {
            // Rob 1 en yüksek olan va zaten
            RobOrNot[i] = Math.max(RobOrNot[i - 1], RobOrNot[i - 2] + nums[i]);
        }

        return RobOrNot[nums.length - 1];  // en sondaki en büyükltür zaten
    }

}
