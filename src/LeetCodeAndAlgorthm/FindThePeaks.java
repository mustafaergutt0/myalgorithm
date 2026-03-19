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
        System.out.println(FindThePeaks.findPeaks(data));
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




    static public int MyPeakAlgortima(int[] nums, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            // 1. Zirve kontrolü (Sınır kontrolleri eklenmiş hali)
            boolean isLeftOk = (mid == 0 || nums[mid] >= nums[mid - 1]);
            boolean isRightOk = (mid == nums.length - 1 || nums[mid] >= nums[mid + 1]);

            if (isLeftOk && isRightOk) {
                return mid;
            }

            // 2. Senin istediğin "iki tarafa da bakma" mantığı
            // Önce sol tarafı dene
            int leftSide = MyPeakAlgortima(nums, low, mid - 1);
            if (leftSide != -1) return leftSide; // Eğer solda bulduysan onu döndür

            // Sol taraf bulamazsa sağ tarafı dene
            return MyPeakAlgortima(nums, mid + 1, high);
        }

        return -1; // Hiçbir yerde zirve yoksa (boş dizi vb.) -1 döner
    }


        static   public int countHillAndValley(int[] nums) {
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



    static public int FindPeakWİthLogn(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if(nums.length == 1) return nums[0];



        // this is my algorithm
        // that ı designed

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // --- İSTEDİĞİN DOĞRUDAN KONTROL ---
            // Eğer (baştaysak VEYA solundakinden büyükse) VE (sondaysek VEYA sağındakinden büyükse)
            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                    (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {   // mid  0 veya lengt son demek tek eleamn var demek
                return mid; // İlk adımda zirveyi bulduysak direkt dönüyoruz
            }

            // Zirve değilsek yön seçiyoruz:
            // Sağdaki eleman benden büyükse sağa git
            if (mid < nums.length - 1 && nums[mid + 1] > nums[mid]) {
                low = mid + 1;
            }
            // Aksi halde sola git
            else {
                high = mid - 1;
            }
        }

        return low;
    }

  }

