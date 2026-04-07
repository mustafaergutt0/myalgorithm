package LeetCodeAndAlgorthm;

public class MaxmimumDİfferencesBetweenİncreasing {
    static void main() {

    }


    static public int maxmimum(int [] nums ){
        int difference=-1;

        int first=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<first){
                first=nums[i];
            }else if(nums[i]>first){ // burası olacak else koyarsan olmaz o iş
                difference=Math.max(difference,nums[i]-first);
            }
        }
        return difference;


    }
}
