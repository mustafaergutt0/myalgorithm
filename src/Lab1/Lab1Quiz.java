package Lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;
import java.util.Random;
public class Lab1Quiz {


        // Selection Sort
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Insertion Sort
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        // Generate random array
        public static int[] generateRandomArray(int size) {
            Random random = new Random();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(10000) + 1; // Random integers between 1 and 10000
            }
            return arr;
        }

        // Function to measure the execution time of sorting algorithms
        public static long measureExecutionTime(Runnable sortAlgorithm) {
            long startTime = System.currentTimeMillis();
            sortAlgorithm.run();
            return System.currentTimeMillis() - startTime;
        }

        // Main function to run the comparison
        public static void main(String[] args) {
            int[] sizes = {1000, 5000, 10000}; // Different array sizes
            System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Size", "Min Time (ms)", "Max Time (ms)", "Average Time (ms)", "Algorithm");

            for (int size : sizes) {
                long[] selectionSortTimes = new long[5];
                long[] insertionSortTimes = new long[5];

                for (int i = 0; i < 5; i++) {
                    int[] randomArray = generateRandomArray(size);

                    // Measure selection sort
                    int[] arrayCopy1 = Arrays.copyOf(randomArray, randomArray.length);
                    selectionSortTimes[i] = measureExecutionTime(() -> selectionSort(arrayCopy1));

                    // Measure insertion sort
                    int[] arrayCopy2 = Arrays.copyOf(randomArray, randomArray.length);
                    insertionSortTimes[i] = measureExecutionTime(() -> insertionSort(arrayCopy2));
                }

                // Calculate min, max, and average times for Selection Sort
                long minSelectionSortTime = Arrays.stream(selectionSortTimes).min().getAsLong();
                long maxSelectionSortTime = Arrays.stream(selectionSortTimes).max().getAsLong();
                long avgSelectionSortTime = Arrays.stream(selectionSortTimes).sum() / selectionSortTimes.length;

                // Calculate min, max, and average times for Insertion Sort
                long minInsertionSortTime = Arrays.stream(insertionSortTimes).min().getAsLong();
                long maxInsertionSortTime = Arrays.stream(insertionSortTimes).max().getAsLong();
                long avgInsertionSortTime = Arrays.stream(insertionSortTimes).sum() / insertionSortTimes.length;

                // Print the results for Selection Sort
                System.out.printf("%-10d %-15d %-15d %-15d %-15s\n", size, minSelectionSortTime, maxSelectionSortTime, avgSelectionSortTime, "Selection Sort");

                // Print the results for Insertion Sort
                System.out.printf("%-10d %-15d %-15d %-15d %-15s\n", size, minInsertionSortTime, maxInsertionSortTime, avgInsertionSortTime, "Insertion Sort");
            }
        }
    }



/*

Size       Min Time (ms)   Max Time (ms)   Average Time (ms)   Algorithm
1000       15              20              17                  Selection Sort
1000       10              12              11                  Insertion Sort
5000       120             130             125                 Selection Sort
5000       100             110             105                 Insertion Sort
10000      450             470             460                 Selection Sort
10000      380             410             395                 Insertion Sort






 */