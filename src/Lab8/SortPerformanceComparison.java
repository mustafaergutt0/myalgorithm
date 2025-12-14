package Lab8;

import java.util.Random;

public class SortPerformanceComparison {

    // Helper function to measure Heap Sort time
    public static long measureHeapSort(int[] array) {
        HeapSort heapSort = new HeapSort();
        int[] copy = array.clone();
        long startTime = System.nanoTime();
        heapSort.heapSort(copy);
        return System.nanoTime() - startTime;
    }

    // Helper function to measure Merge Sort time
    public static long measureMergeSort(int[] array) {
        MergeSort mergeSort = new MergeSort();
        int[] copy = array.clone();
        long startTime = System.nanoTime();
        mergeSort.mergeSort(copy, 0, copy.length - 1);
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        int[] inputSizes = {4, 64, 256, 1024, 4096, 16384, 65536, 262144, 1048576,4194304,16777216,67108864};
        System.out.printf("%-12s %-20s %-20s%n", "Input Size", "Heap Sort Time (ns)", "Merge Sort Time (ns)");

        for (int size : inputSizes) {
            int[] array = new Random().ints(size, 0, 100).toArray();

            long heapSortTime = measureHeapSort(array);
            long mergeSortTime = measureMergeSort(array);

            System.out.printf("%-12d %-20d %-20d%n", size, heapSortTime, mergeSortTime);
        }
    }
}

