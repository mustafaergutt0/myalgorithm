package LeetCodeAndAlgorthm;

import java.util.HashMap;

public class FirstMissingPositive {
    static void main() {

        int data[]={1,2,-2,3,4};
        System.out.println(firstMissingPostiveWithoutAuxilry(data));

    }



    static int firstMissingPostiveWithoutAuxilry(int[] nums) {

        int n=nums.length;
        boolean HasOne=false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                HasOne=true;
            }
        }
        if(!HasOne){
            return 1;
        }  // yeni bir yoksa direk döndür
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=1;  // falzaldan n büyükleri için bir yap sıfırdan küçükleri de bri yapki bizim işaretlemediğim belli olsun
            }
        }

        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            int temp=val-1;
            if(nums[temp]>0){
                nums[temp]*=-1;
            }
         }
        for(int i=0;i<n;i++){
            if(nums[i]<0){

            }else{
                return i+1;  // bu neden böyle
                // çünkü koyduğumuz index bir eksiyle negatif yaptık  // ayrrıca burdan ilk üçüü istediğim kadarını bile bularilz
            }
        }

        return n+1;




    }

    static int firstMissingPostive(int [] nums){

        // evet bu çalışıyor fakat o(n) fakat auxliary space de O(n) adamlar bunu  o(1) isityor  ileri düzey 
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i = 0; i < nums.length; i++){
            map.put(i,nums[i]);
            if(nums[i]>count){
                count=nums[i];
            }
        }

        for(int i = 1; i < count; i++){
            if(!map.containsValue(i)){
                return i;
            }
        }

     return  count+1;

    }

   /* static int firstMissingPositiveWithAuxliaryZero(int[] nums){


    }

    */



}
