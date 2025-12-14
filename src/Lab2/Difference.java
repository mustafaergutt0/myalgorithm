package Lab2;

import java.util.Arrays;
import java.util.Random;


public class Difference {

    public static void main(String[] args) {
        compareSorts();
    }

    // Insertion Sort implementation
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort implementation
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Compare performance of Insertion Sort and Merge Sort
    public static void compareSorts() {
        Random rand = new Random();
        for (int n = 1; n <= 100; n++) {  // Test for sizes from 1 to 100
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                int num = rand.nextInt(1000);
                arr1[i] = num;
                arr2[i] = num;
            }

            long startTimeInsertion = System.nanoTime();
            insertionSort(arr1);
            long endTimeInsertion = System.nanoTime();
            long insertionSortTime = endTimeInsertion - startTimeInsertion;

            long startTimeMerge = System.nanoTime();
            mergeSort(arr2, 0, n - 1);
            long endTimeMerge = System.nanoTime();
            long mergeSortTime = endTimeMerge - startTimeMerge;

            System.out.printf("n = %d -> Insertion Sort: %d ns | Merge Sort: %d ns%n", n, insertionSortTime, mergeSortTime);

            if (insertionSortTime < mergeSortTime) {
                System.out.printf("For n = %d, Insertion Sort is faster.%n", n);
            } else {
                System.out.printf("For n = %d, Merge Sort is faster.%n", n);
            }
        }
    }
}
