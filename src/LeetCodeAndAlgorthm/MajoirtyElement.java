package LeetCodeAndAlgorthm;


// in given array find most repet element

import java.util.HashMap;
import java.util.Map;

public class MajoirtyElement {
    public static void main(String[] args) {

        int data[]={2,2,1,1,1,2,2,2,2,2};
        System.out.println(WhichNumberMajoriryElement(data));

    }

    public static  int HowMuchMajoiryElement(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int x:arr){
            if(map.get(x)>max){
                max=map.get(x);
            }

        }
        return max;
    }


    public static int WhichNumberMajoriryElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        // 1) Frekansları say
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // 2) En yüksek frekansı ve elemanı bul
        int max = 0;
        int element = arr[0];
        for (int x : arr) {
            int count = map.get(x);
            if (count > max) {
                max = count;
                element = x;
            }
        }
        return element;
    }
}
