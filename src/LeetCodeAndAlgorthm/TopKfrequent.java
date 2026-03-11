package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Map;

public class TopKfrequent {

    static void main() {




    }


    static public int[] topKFrequent(int[] nums, int k) {
        // 1. ADIM: HashMap içine koy (Frekansları say)
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        // 2. ADIM: Değişkenlerle "En Yüksek" ve "İkinci En Yüksek" olanı bul
        // (Örnekte k=2 varsayılmıştır, dinamik k için dizi kullanılabilir)
        int firstMaxFreq = -1;
        int firstMaxKey = 0;

        int secondMaxFreq = -1;
        int secondMaxKey = 0;

        for (Integer key : counts.keySet()) {
            int currentFreq = counts.get(key);

            // Eğer şu anki sayı, birinciden daha büyükse
            if (currentFreq > firstMaxFreq) {
                // Eskiden birinci olan artık ikinci olur
                secondMaxFreq = firstMaxFreq;
                secondMaxKey = firstMaxKey;

                // Yeni birinciyi güncelle
                firstMaxFreq = currentFreq;
                firstMaxKey = key;
            }
            // Eğer birinciden küçük ama ikinciden büyükse
            else if (currentFreq > secondMaxFreq) {
                secondMaxFreq = currentFreq;
                secondMaxKey = key;
            }
        }

        // 3. ADIM: Sonucu döndür
        return new int[]{firstMaxKey, secondMaxKey};
    }
}
// iiçine while ödngüsü koyup kaç tane kaç tane freuwnecy isitotka o olur yada buckt sortta olur
