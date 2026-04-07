package LeetCodeAndAlgorthm;

public class TransportArrayPARİTY {
    static void main() {

    }

    static int [] arrayParity(int [] nums) {

        //  yeni bri array oşutiur sadece bir ve sıfırladan oluiacak ve ilk arrayin tek tek ve çiftlere göre düzenle

        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(even==0){
                nums[i]=1;
                odd--;
            }else{
                nums[i]=0;
                even--;
            }


        }
        return  nums;
    }
}
