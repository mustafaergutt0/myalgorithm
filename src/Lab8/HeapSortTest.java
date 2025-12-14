package Lab8;

import java.util.Random;

public class HeapSortTest {

    public static void main(String[] args) {
        int[] heapArray = new Random().ints(67108864, 0, 100).toArray();

        // Giriş dizisini ekrana yazdır
        System.out.println("Giriş Dizisi:");
        for (int num : heapArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Heap Sort işlemi
        HeapSort heapSort = new HeapSort();
        MergeSort mergeSort = new MergeSort();
        // Merge Sort işlemi
        mergeSort.mergeSort(heapArray, 0, heapArray.length - 1);


        // Çıktıyı ekrana yazdır
        System.out.println("Heap Sort Sonucu:");
        for (int num : heapArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

