package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindİndicesAfterSortingArray {
    static void main() {


        int data []={1,2,3,4,5,5,5,5,6,1,2,5,6,6,6,6,6};
        System.out.println(FindFirstANDLastİndecies(data,5));
        System.out.println("GİVE ME DİFFERENCE");
        System.out.println(FindAllofİNdices(data,5));

    }




    static List<Integer> FindFirstANDLastİndecies(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int Small = -1; // -1 ile başlatmak "henüz bulamadık" demek için kritik
        int Big = -1;

        while (left <= right) {
            if (nums[left] == target) {
                // Eğer Small hala -1 ise, bu ilk kez target bulduğumuz andır
                if (Small == -1) {
                    Small = left;
                }
                // Sayıyı her bulduğumuzda Big'i güncelliyoruz,
                // böylece en sonuncu indexte kalıyor.
                Big = left;
            }
            // DİKKAT: left++ if bloğunun dışında olmalı,
            // yoksa continue kullanınca bu satırı atlar ve sonsuz döngüye girer.
            left++;
        }

        // Listeye senin istediğin Small ve Big değerlerini ekliyoruz
        if (Small != -1) {
            ans.add(Small);
            ans.add(Big);
        }

        return ans;
    }


    static List<Integer> FindAllofİNdices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int Small = -1; // -1 ile başlatmak "henüz bulamadık" demek için kritik
        int Big = -1;

        while (left <= right) {
            if (nums[left] == target) {
                ans.add(left);
            }

            left++;
            }


        return ans;
    }


}
