package LeetCodeAndAlgorthm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//  17/03/2026   ı have been trying different solution one of them log n with binary seach otherwise , another solution normally
// brute force
// easy way that ı prefer
public class FindThePeaks {

    static void main() {

        int data []={2,4,1,1,6,5};
        System.out.println(findPeaks(data));
        System.out.println(countHillAndValley(data));

    }



  static public List<Integer> findPeaks(int[] mountain){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i+1]&& mountain[i]>mountain[i-1]){
                list.add(i);
            }
        }

        return list;
  }

  static  public int FindPeaksWithLogN(int [] nums){
     return 5;
  }


    public static int countHillAndValley(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            // Eğer şu anki sayı bir öncekiyle aynıysa, burayı zaten bir önceki adımda
            // "bir bütün olarak" kontrol etmişizdir. Tekrar bakmaya gerek yok.
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // 1. SOL KOMŞUYU BUL (Eşit olmayan ilk sayı)
            int left = i - 1;  // bunların olması döngü her döndüğünde
            while (left >= 0 && nums[left] == nums[i]) {
                left--;
            }

            // 2. SAĞ KOMŞUYU BUL (Eşit olmayan ilk sayı)
            int right = i + 1;
            while (right < nums.length && nums[right] == nums[i]) {
                right++;
            }

            // Eğer her iki tarafta da farklı bir komşu varsa kontrol et
            if (left >= 0 && right < nums.length) {
                // Tepe durumu
                if (nums[i] > nums[left] && nums[i] > nums[right]) {
                    count++;
                }
                // Vadi durumu
                else if (nums[i] < nums[left] && nums[i] < nums[right]) {
                    count++;
                }
            }
        }

        return count;
    }


  }

