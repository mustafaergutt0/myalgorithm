package Lab10;

import java.util.Random;

public class Myquicksort {

    // Partition Method
    public static int partition(int[] A, int p, int r) {
        int x = A[r]; // Pivot element
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                exchange(A, i, j);
            }
        }
        exchange(A, i + 1, r);
        return i + 1;
    }

    // Randomized Partition Method
    public static int randomizedPartition(int[] A, int p, int r) {
        Random rand = new Random();
        int i = rand.nextInt((r - p) + 1) + p; // Random index between p and r
        exchange(A, r, i); // Swap A[r] with A[i]
        return partition(A, p, r);
    }

    // Randomized QuickSort Method
    public static void randomizedQuickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = randomizedPartition(A, p, r);
            randomizedQuickSort(A, p, q - 1);
            randomizedQuickSort(A, q + 1, r);
        }
    }

    // Utility method to exchange two elements
    public static void exchange(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] A = {10, 80, 30, 90, 40, 50, 70};
        int n = A.length;

        System.out.println("Unsorted Array:");
        for (int i : A) {
            System.out.print(i + " ");
        }

        randomizedQuickSort(A, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}

