package Lab2;

import java.util.Random;

public class MergeSort {

    // Part (a): Merge function without sentinels
    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        // Create temporary arrays to hold the subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temporary arrays L[] and R[]
        for (int i = 0; i < n1; i++)
            L[i] = A[p + i];
        for (int j = 0; j < n2; j++)
            R[j] = A[q + 1 + j];

        // Merge the temp arrays back into A[p..r]
        int i = 0, j = 0;
        int k = p;
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

        // Copy the remaining elements of L[], if any
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if any
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort function
    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);        // Sort first half
            mergeSort(A, q + 1, r);    // Sort second half
            merge(A, p, q, r);         // Merge the sorted halves
        }
    }

    public static void main(String[] args) {
        // Part (b): Initialize an array of size 16 with random integers
        Random rand = new Random();
        int[] A = new int[16];  // Array of size 16

        // Initialize the array with random integers between 0 and 99
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
        }

        // Output original array
        System.out.println("Original array:");
        for (int value : A) {
            System.out.print(value + " ");
        }

        // Perform merge sort
        mergeSort(A, 0, A.length - 1);

        // Output sorted array
        System.out.println("\nSorted array:");
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
