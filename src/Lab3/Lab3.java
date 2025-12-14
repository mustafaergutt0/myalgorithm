package Lab3;

import java.util.Random;

public class Lab3 {

    // Insertion Sort Algorithm
    public static void insertion_sort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // we have already inserito sort ı added
    }

    // Merge function for Merge Sort
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

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

        // this is merge sort every part is divied by this algortihm
    }

    // Standard Merge Sort Algorithm
    public static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            merge_sort(arr, left, mid);   // every part of data balanced is given merge sort in start and middle
            merge_sort(arr, mid + 1, right); // middele and final is given again

            merge(arr, left, mid, right);
        }
    }

    // Improved Merge Sort with Insertion Sort at the base level
    public static void merge_sort_improved(int[] arr, int left, int right, int level, int max_level) {
        if (left < right) {
            if (level >= max_level) {
                insertion_sort(arr, left, right);  // Use insertion sort at the base level
            } else {
                int mid = (left + right) / 2;
                merge_sort_improved(arr, left, mid, level + 1, max_level);
                merge_sort_improved(arr, mid + 1, right, level + 1, max_level);
                merge(arr, left, mid, right);
            }
        }
    }

    public static void main(String[] args) {
        // Question (a) - Array Initialization
        int[] arr = new int[65536];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);  // Random numbers between 0 and 99
        }

        // Question (a) - Merge Sort and Timing
        long startTime = System.nanoTime();
        merge_sort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("time taken : " + elapsedTime + " ns");

        // Question (d) - Improved Merge Sort with max_level = 13
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);  // Re-initialize array
        }

        startTime = System.nanoTime();
        merge_sort_improved(arr, 0, arr.length - 1, 1, 13);  // max_level = 13
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("max level : " + elapsedTime + " ns");


        for (int maxLevel = 1; maxLevel <= 17; maxLevel++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);  // Re-initialize array
            }
            startTime = System.nanoTime();
            merge_sort_improved(arr, 0, arr.length - 1, 1, maxLevel);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time taken with max_level " + maxLevel + ": " + elapsedTime + " ns");
        }
    }
}
