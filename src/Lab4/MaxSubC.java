package Lab4;

import java.util.Random;

public class MaxSubC {

    public static void main(String[] args) {
        // 65536 elemanlı rastgele bir dizi oluştur
        int[] A = new int[65536];
        Random rand = new Random();
        for (int i = 0; i < 65536; i++) {
            A[i] = rand.nextInt(1000);  // 0 ile 99 arasında rastgele sayılar
        }

        // Fark dizisini oluştur
        int[] diff_A = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            diff_A[i] = A[i + 1] - A[i];
        }

        // Zaman ölçümü ve maximum subarray testi
        long startTime = System.nanoTime();
        int[] result = dividecon.find_maximum_subarray(diff_A, 0, diff_A.length - 1);
        long endTime = System.nanoTime();

        // Sonuçları ekrana yazdır
        System.out.println("Left index: " + result[0] + ", Right index: " + result[1] + ", Max difference: " + result[2]);
        System.out.println("Execution time (ns): " + (endTime - startTime));
    }




}