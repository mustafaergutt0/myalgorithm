package Lab2;
import java.util.Random;

public class MergeSorrTest {

    // Merge fonksiyonu (sentinelsiz)
    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        // Geçici diziler
        int[] L = new int[n1];
        int[] R = new int[n2];

        // L ve R dizilerine değerleri kopyalama
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0, j = 0;
        int k = p;

        // Dizileri birleştirme
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        // Kalan elemanları kopyala (bir dizi tamamen bitmiş olabilir)
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort fonksiyonu
    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void main(String[] args) {
        // 16 elemanlı bir dizi oluştur
        int[] array16 = new int[16];
        Random rand = new Random();

        // Diziyi rastgele sayılarla doldur
        System.out.println("Orijinal dizi:");
        for (int i = 0; i < array16.length; i++) {
            array16[i] = rand.nextInt(100);  // 0 ile 99 arasında rastgele sayılar
            System.out.print(array16[i] + " ");
        }
        System.out.println();

        // Merge sort ile sıralama
        mergeSort(array16, 0, array16.length - 1);

        // Sıralanmış diziyi yazdır
        System.out.println("Sıralanmış dizi:");
        for (int num : array16) {
            System.out.print(num + " ");
        }
    }
}
