package lab11;

import java.sql.SQLOutput;

public class CountingSort {

    public static void countingSort(int[] A, int[] B, int k) {
        // Step 1: Create array C to store counts of elements
        int[] C = new int[k + 1];  // Array C from 0 to k

        // Step 2: Initialize C with 0
        for (int i = 0; i <= k; i++) {
            C[i] = 0;
        }

        // Step 3: Count occurrences of each element in A
        for (int j = 1; j <= A.length; j++) {
            C[A[j - 1]] = C[A[j - 1]] + 1;  // A[j-1] since A starts from 1
        }

        // Step 4: Update C to store the cumulative count
        for (int i = 1; i <= k; i++) {
            C[i] = C[i] + C[i - 1];
        }

        // Step 5: Place elements in B, sorted
        for (int j = A.length; j >= 1; j--) {
            B[C[A[j - 1]] - 1] = A[j - 1];  // A[j-1] to access correct index
            C[A[j - 1]] = C[A[j - 1]] - 1;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2, 8, 3, 6,5 };  // Input array (starting from index 1)
        int[] B = new int[A.length];      // Output array
        int k = 8;                        // Maximum value in array A

           // first array
        for (int i = 0; i < B.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        countingSort(A, B, k);

        // Output the sorted array
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

