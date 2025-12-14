package lab11;

import java.util.Random;

public class SortCompare {

    public static void main(String[] args) {
        // Part D: Compare Sorting Algorithms with Fixed Input Range
        compareSortingAlgorithmsFixedRange();

        // Part C: Compare Sorting Algorithms with Variable Input Range
        compareSortingAlgorithmsVariableRange();
    }

    // Counting Sort Implementation
    public static void countingSort(int[] array, int range) {
        int n = array.length;
        int[] count = new int[range + 1];
        int[] output = new int[n];

        // Count occurrences of each value
        for (int num : array) {
            count[num]++;
        }

        // Cumulative count
        for (int i = 1; i <= range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, array, 0, n);
    }

    // Part D: Fixed Input Range (0 to 9,999,999)
    public static void compareSortingAlgorithmsFixedRange() {
        int[] sizes = {10, 100, 1000, 10000, 100000};
        System.out.printf("%-10s %-20s %-20s %-20s\n", "Input Size", "Counting Sort (ns)", "Heap Sort (ns)", "Merge Sort (ns)");
        for (int size : sizes) {
            int[] array = new Random().ints(size, 0, 10000000).toArray();

            long countingSortTime = measureSortingTime(array.clone(), arr -> countingSort(arr, 9999999));
            long heapSortTime = measureSortingTime(array.clone(), SortCompare::heapSort);
            long mergeSortTime = measureSortingTime(array.clone(), SortCompare::mergeSort);

            System.out.printf("%-10d %-20d %-20d %-20d\n", size, countingSortTime, heapSortTime, mergeSortTime);
        }
    }

    // Part C: Variable Input Range (0 to size-1)
    public static void compareSortingAlgorithmsVariableRange() {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
        System.out.printf("%-10s %-20s %-20s %-20s\n", "Input Size", "Counting Sort (ns)", "Heap Sort (ns)", "Merge Sort (ns)");
        for (int size : sizes) {
            int[] array = new Random().ints(size, 0, size).toArray();

            long countingSortTime = measureSortingTime(array.clone(), arr -> countingSort(arr, size - 1));
            long heapSortTime = measureSortingTime(array.clone(), SortCompare::heapSort);
            long mergeSortTime = measureSortingTime(array.clone(), SortCompare::mergeSort);

            System.out.printf("%-10d %-20d %-20d %-20d\n", size, countingSortTime, heapSortTime, mergeSortTime);
        }
    }

    // Measure Sorting Time
    public static long measureSortingTime(int[] array, SortingFunction sortFunction) {
        long startTime = System.nanoTime();
        sortFunction.sort(array);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Functional Interface for Sorting
    @FunctionalInterface
    interface SortingFunction {
        void sort(int[] array);
    }

    // Merge Sort Implementation
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    // Heap Sort Implementation
    public static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
}
