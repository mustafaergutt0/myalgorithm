package Lab2;

public class mergesortwithout {

    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1; // Length of left half
        int n2 = r - q;     // Length of right half

        // Create temporary arrays for left and right halves
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[q + 1 + i];
        }

        // Merge the temporary arrays back into A[p..r]
        int i = 0, j = 0;
        int k = p;

        // Compare and merge the arrays until one of them is exhausted
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

    public static void merge_sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }
}