package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.List;

public class PartitionOfArraytogivenPoint {

    //  veirlen array te pivot göre sol tarafına sıralyısa küçükleri sağ tarafına büyükleri koymalsın


    // iki yakşlaım bri tanesi daha hızlı olan two pointer diğeri liste yaklaşımı benim aklıma ilk gelen ikisinde şimdi yaxazcagı

    static void main() {

    }






    static public int [] paritonofArray(int[] arr, int pivot) {

        // bu benim yakşlaımım
        int myarray[]=new int [arr.length];
        List<Integer> listLess=new ArrayList<>();
        List<Integer> listEquals=new ArrayList<>();
        List<Integer> ListBigger=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                listEquals.add(i);
            }if(arr[i]>pivot){
                ListBigger.add(arr[i]);
            }else {
                listLess.add(arr[i]);
            }
        }

        int index=0;
        for(int c:listLess){
            myarray[index++]=c;
        }
        for(int c:listEquals){
            myarray[index++]=c;
        }
        for(int c:ListBigger) {
            myarray[index++] = c;
        }

        return myarray;

    }




    static public int [] partitionArrayWithTwoPointer( int [ ] nums, int pivot ){
       // bu yarıb düzelticlecek bu kodda daha iyin düşün
        int mynewarray[]= new int [nums.length];
        int left=0;
        int right=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                mynewarray[left]=nums[i];
                left++;
            }if(nums[i]>pivot){
                mynewarray[right]=nums[i];
                right--;// içine koy ve azalt demek
            }
        }

        while (left <= right) {
            mynewarray[left] = pivot;
            left++;
        }

        return mynewarray;




    }
}
